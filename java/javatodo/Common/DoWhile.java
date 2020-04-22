package Common;

import java.util.Date;

import org.junit.Test;

public class DoWhile {
 

     @Test
    public  void testDoWhile(){
        int a=0;
        do{
          a++;
          System.out.println("runing"+(new Date()));
        }while(a<10);
    }
}