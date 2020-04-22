package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class HashMap_Imp {

    @Test
    public void testHashMap(){
        HashMap  hm=new HashMap<>();
        hm.put("tianjing", "tianjing");
        HashMap  hm2=new HashMap<String,ObjectA>();
        var value=new ObjectA();
        hm2.put("key", value);
    }
   
    @Test
    public void  testHashMap_LinkedHashMap(){
        Map linkMap=new LinkedHashMap<Integer,String>();
        linkMap.put(6, "car");
        linkMap.put(5, "motorcycle");
        linkMap.put(3, "bus");
        System.out.println("=============LinkedHashMap============");
        for (Iterator  it = linkMap.keySet().iterator();it.hasNext();) {
            Object key=it.next();
            System.out.println(key+"="+linkMap.get(key));
            
        }
        System.out.println("=============HashMap============");
        Map map=new HashMap<Integer,String>();
        map.put(6, "car");
        map.put(5, "motorcycle");
        map.put(3, "bus");
        for (Iterator it=map.keySet().iterator();it.hasNext();) {
            Object key=it.next();
            System.out.println(key+"="+map.get(key));
            
        }

}
}
class ObjectA{

}