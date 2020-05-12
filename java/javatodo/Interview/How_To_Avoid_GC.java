package Interview;

import org.junit.Test;

public class How_To_Avoid_GC {

     public static How_To_Avoid_GC  gc=null;
     public static How_To_Avoid_GC fe = null;


     public void checkAlive(){
         System.out.println("im still alive");
     }

     @Override
     public void finalize() throws Throwable {
         super.finalize();
         System.out.println("finalize executed");
         How_To_Avoid_GC.gc=this;
     }
   @Test
   public  void  Run() throws InterruptedException {

    gc=new How_To_Avoid_GC();

    gc=null;
    System.gc();
    Thread.sleep(500);  
    if(gc!=null){
        gc.checkAlive();
    }else{
        System.out.println("gc is dead");
    }
    gc=null;
    System.gc();
    Thread.sleep(500);  
    if(gc!=null){
        gc.checkAlive();
    }else{
        System.out.println("gc is dead");
    }

   }
}
