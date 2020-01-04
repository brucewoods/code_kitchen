using System;
using System.Collections;
using System.Collections.Generic;
public  class ReTesting{

    public  static void abc(){
         var s=new List<int>(){3,4,5};
         var o=new object[]{9};
         s.GetType().GetMethod("Add").Invoke(s,o);
         foreach(var d in s)
         Console.WriteLine("digit "+d);
    }


}

