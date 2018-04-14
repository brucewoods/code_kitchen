using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;

namespace Domingod
{       
public class ThreadManager{

  public ThreadManager(int limit,ParameterizedThreadStart threadStart){

       Limit=limit;
       Threads=new List<Thread>();
       Starter=threadStart;
      
       for(int i=0; i<limit;i++){
         var t=new Thread(threadStart)  ;
         t.IsBackground=true;
         t.Name="thread"+i;
         Threads.Add(t);

       }   
  
  }

  public void ProcessThread(object o){
    //    var isBusy=false;
    //    if(!isBusy){
          for(int i=0;i<Threads.Count;i++){
              var th=Threads[i];
              var st=Threads[i].ThreadState.ToString().Split(',').Last().Trim();
              if(new[]{ThreadState.Aborted.ToString(),ThreadState.Stopped.ToString(),ThreadState.Unstarted.ToString()}.Contains(st)){
                
                  th=new Thread(Starter);
                  th.Name="thread"+i;
                  th.IsBackground=true;
                  
                  th.Start(o);
                //   isBusy=true;
                    
                    break;
              } else{
//    Thread.Sleep(10);
                  Console.Write("thread {0} is not available  \r\n",i);
                  Thread.Sleep(10);
              } 

        //   }
          }

  }
 
 
 public  int Limit{get;set;}
 public List<Thread> Threads{get;set;}

 public ParameterizedThreadStart  Starter{get;set;}
}

}