package Interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.Test;

public class Diff_ArrayList_Vector {
  ///和ArrayList和Vector一样，同样的类似关系的类还有HashMap和HashTable，StringBuilder和StringBuffer，后者是前者线程安全版本的实现。
   
    
    @Test
    public  void testArray(){
        ArrayList  aList=new ArrayList<>();
     
        aList.add(1);
        aList.add(3);
        aList.add("hello");
        assertEquals("hello",aList.get(2),"alist");
        
    }

}