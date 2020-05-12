package DesignPattern.Adapter;

import org.junit.Test;

public class Client {
    
    @Test
    public  void Test(){
          Tap  tap=new Adapter();
          System.out.println(tap.WaterOutput(4));
          System.out.println(tap.WaterOutput(6));
    
    }
}