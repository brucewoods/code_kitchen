using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Threading;
using System.Web;
using System.Web.Mvc;
using ConcurrentModifyingData.Models;
namespace ConcurrentModifyingData.Controllers
{
	public class HomeController : Controller
	{
		public ActionResult Index()
		{
			SubmitOrder();
			return View();
		}

		public ActionResult DoInProc()
		{
			int proId = 1;
			bool notcon = LockForProcedure(proId);
			Thread.Sleep(500);
			int retry = 10;

			while (!notcon && retry > 0)
			{
				retry--;
				LockForProcedure(proId);
			}

			return null;
		}

		public ActionResult DoInEFPropertyConcurrencyFixure()
		{
			int re = LockForEf();
			Thread.Sleep(500);
			int retry = 10;
			while (re < 0 && retry > 0)
			{
				retry--;
				re = LockForEf();
			}

			return null;
		}
		public void SubmitOrder()

		{
			int p = 1;

			using (CocurrentDBEntities db = new CocurrentDBEntities())
			{

				var log = db.InventoryLog;
				var inventory = db.Inventory;
				using (var transaction = db.Database.BeginTransaction())
				{
					var inventory_model = inventory.FirstOrDefault(a => a.ProductId == p);
					inventory_model.ProductCount = inventory_model.ProductCount - 1;
					int stat = db.SaveChanges();
					InventoryLog logmodel = new InventoryLog()
					{
						Title = "logged,see coccurence happening"
					};
					log.Add(logmodel);
					db.SaveChanges();
					Thread.Sleep(500);
					transaction.Commit();

				}


			}
			//using()

			//using(Co)
		}
		public int LockForEf()

		{
			int p = 1;
			int receive = 0;
			using (SaveChangeForConcurrency db = new SaveChangeForConcurrency())
			{

				var log = db.InventoryLog;
				var inventory = db.Inventory;
				using (var transaction = db.Database.BeginTransaction())
				{
					var inventory_model = inventory.FirstOrDefault(a => a.ProductId == p);
					inventory_model.ProductCount = inventory_model.ProductCount - 1;
					receive = db.SaveChanges();
					InventoryLog logmodel = new InventoryLog()
					{
						Title = "logged,see coccurence happening"
					};
					log.Add(logmodel);
					db.SaveChanges();
					Thread.Sleep(500);
					transaction.Commit();

				}


			}

			return receive;
			//using()

			//using(Co)
		}

		private bool LockForProcedure(int proId)
		{
			using (CocurrentDBEntities db = new CocurrentDBEntities())
			{
				SqlParameter[] parameters =
				{
					new SqlParameter("@ProductId", SqlDbType.Int),
					new SqlParameter("@IsSuccess", SqlDbType.Bit)

				};
				parameters[0].Value = proId;
				parameters[1].Direction = ParameterDirection.Output;
				var data = db.Database.ExecuteSqlCommand("exec LockProc @ProductId,@IsSuccess output", parameters);
				string n2 = parameters[1].Value.ToString();

				return n2 == "True";
			}
		}
		public ActionResult About()
		{
			ViewBag.Message = "Your application description page.";

			return View();
		}

		public ActionResult Contact()
		{
			ViewBag.Message = "Your contact page.";

			return View();
		}
	}
}