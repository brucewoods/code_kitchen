using System;
using System.Collections.Generic;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Web;

namespace ConcurrentModifyingData.Models
{
	public class SaveChangeForConcurrency:CocurrentDBEntities
	{
		public override int SaveChanges()
		{
			try
			{
				return base.SaveChanges();
			}
			catch (DbUpdateConcurrencyException e)
			{
				return -1;
			}
		}
	}
}