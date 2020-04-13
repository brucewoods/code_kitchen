package StringTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

 
import org.junit.jupiter.api.Test;
class StringCode{

     @Test
     void  TestStringWith1Param(){
         
         final String test1 = new String("sea");
         assertEquals("sea", test1, "test1");
     }
     
     @Test
     void TestStringWith2Parms(){
           byte[] bs=new byte[2];
           bs[0]=3;
           bs[1]=33;
         final String test=new  String(bs);
      
         

     }
}