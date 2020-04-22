package Interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class FailFast_FailSafe {


    @Test
 public  void  failFast(){
    Map<String,String>  provinceCode=new HashMap<String,String>();
    provinceCode.put("FJ", "fujian");
    provinceCode.put("SH", "shanghai");
    provinceCode.put("HN", "henan") ;
    Iterator  it=provinceCode.keySet().iterator();
    while(it.hasNext()){
        System.out.println(provinceCode.get(it.next()));
        provinceCode.put("XJ","xinjiang");
    }
    

 }
 @Test
 public void faitFast2(){
    ArrayList<Integer>  aList=new ArrayList<>();
    aList.add(1);
    aList.add(2);
    aList.add(3);
    aList.add(4);
    aList.add(5);
    Iterator<Integer>  it=aList.iterator();
    // while(it.hasNext()){
    //     System.out.println(it.next());
    //     if(it.next()==2)
    //     {
            
    //         it.remove();}
    // }

      System.out.println(aList);
      it=aList.iterator();
     try {
    
      while(it.hasNext()){
         if(it.next()==3){
          aList.remove(3);
         }
      }
           
     } catch (Exception e) {
         System.out.println(e.getCause().getMessage());
         System.out.println(e.getLocalizedMessage());
        assertEquals(true,e.getMessage().contains("Concurrent"), "exception");
    }

 }  

}