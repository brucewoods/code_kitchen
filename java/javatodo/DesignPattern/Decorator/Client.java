package DesignPattern.Decorator;

import org.junit.Test;

public class Client {
    

    @Test
    public void Test(){

         Modeling  modeling=new FilmStar();
         Modeling  beautify1=new Haircut(modeling);
         Modeling  beautify2=new SkinMassage(beautify1);
         beautify2.cost();
         
    }
}