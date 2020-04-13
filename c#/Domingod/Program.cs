using System;
using System.Threading;

namespace Domingod
{

     
    class Program
    {
           
        public void Testvoid(){

        }
        // static void Main(string[] args)
        // {
        //     // Resizer.WriteSomething();

        //     // NewYorCitySearch();
        //    // PrintWords();
        //    ReTesting.abc();
        //    var date=DateTime.Now;
        //    var lastmonth=date.AddDays(-date.Day).ToString("yyyy-MM-dd");
        //    Console.WriteLine(lastmonth);
        // }
          

         
         private static void PrintWords(){
 
            var printer=new ThreadManager(10,_print) ;
            for(int i=0; i<=1000;i++){
             printer.ProcessThread(i);
            }
        }
        private  static void _print(object o){
             
             Console.WriteLine("{0} this is what i had print \r\n",o);
        }

        private static void NewYorCitySearch(){
             #region  ThreadPool for police searching

           int  copSent=10;
           ManualResetEvent[] missionDone=new ManualResetEvent[copSent];

           SearchMission[]   searchs=new SearchMission[copSent];
           var rd=new Random();
           for(int i=0;i<copSent;i++){
                 
                missionDone[i]=new ManualResetEvent(false);
                var m=new SearchMission(rd.Next(20,50),missionDone[i]);
                searchs[i]=m;
                System.Threading.ThreadPool.QueueUserWorkItem(m.MissionReport,i);

           }
                
           foreach(var m in missionDone)
              m.WaitOne();
           Console.WriteLine("{0} cops search done!\r\n",copSent);
           // display the report

           foreach(var s in searchs){

               Console.WriteLine("cop NO:{0} address:{1} \r\n",s.CopNO,s.AddressPoint);

           }
          
           #endregion 
        }
    }
}
