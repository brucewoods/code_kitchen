 
 
public class Bread{
 
   private static Bread bread=new Bread();
      
     public Bread(){
         System.Console.WriteLine("delicious bread  ready  ");
     } 
     public static  Bread GetInstance(){

       return  bread;
   }   
    public void ChargeEnergy(){
     System.Console.WriteLine("a bread makes man full  ");
    }
}