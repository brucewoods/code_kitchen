public class Bread2{
       
     private static  Bread2 bread;

     static Bread2(){
         bread=new Bread2();
     }
     public static Bread2 GetInstance(){
         return bread;
     }
          
}