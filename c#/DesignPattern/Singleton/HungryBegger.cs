using NUnit.Framework;
public class HungryBegger{
     [TestCase]
     public void  NeedFood(){
         Bread.GetInstance().ChargeEnergy();
          
         Assert.Pass();
     }

}