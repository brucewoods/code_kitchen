using System;
using System.Threading;
namespace Domingod
{
public class   SearchMission{
   
      
       public SearchMission  (int copNO,ManualResetEvent missionDone){
       _copNO=copNO;
       _missionDone=missionDone;
       }
       
       public  void  MissionReport(object path){
        var line=(int)path;
         Console.Write("Line {0}  is checking, Cop No: {1} \r\n",line,_copNO);
        _addressPoint=RandomPoint(_copNO);
        Console.Write("  At Adress Point {0},Mission done! \r\n",_addressPoint);
     
        _missionDone.Set();

       }
       
      public  int RandomPoint(int n){

        if(n<=1) return n;
         return  RandomPoint(n-1)+RandomPoint(n-2);


      }

      public  int CopNO{ get{return _copNO;} }

      private int  _copNO;

      public  int AddressPoint{get{return _addressPoint;}}
      private int _addressPoint;

      public ManualResetEvent MissionDone{get{return _missionDone;}}
      private ManualResetEvent _missionDone;

}

}