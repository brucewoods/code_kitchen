package Interview;
import org.junit.Test;

public class String_StringBuilder_StringBuffer {


    public  void testString(){

        String str=new String("ear"); // constant     create many instance in mem......
        StringBuilder sb=new StringBuilder(str); // thread unsafe  -- 
        StringBuffer  sbf=new StringBuffer(str);// thread safe  

    }
  

    @Test
    public void testString2(){

        String a="abc";
        String b="abc";
        String c=new String("abc");
        String d="ab"+"c";
        String e=c.intern();
        System.out.println("a==b: "+(a==b));
        System.out.println("a/b==c: "+ (a==c));
        System.out.println("a/b==d: "+(a==d));
        System.out.println("c==d: "+(a==d));
        System.out.println("e==a: "+(a==e));
    }
    @Test
    public void testString3(){
        String aa="hello2";
        final String bb="hello";  //final to make variable to constant
        String dd="hello";
        String cc=bb+2; // also = "hello"+2
        String ee=dd+2;
        String ff="hello"+2;
        System.out.println("aa==cc:" +(aa==cc));  //true
        System.out.println("aa==ee:" +(aa==ee));  //false
        System.out.println("aa==ff:" +(aa==ff));   //true
       
        System.out.println("cc==ff:" +(cc==ff));   //true
        System.out.println("ee==ff:" +(ee==ff));   //false
        
       

    }

    }

 