package Interview;

import org.junit.Test;

public class GC_Theory {
   

    
    @Test
    public void testGC(){
     
        String s1="ea";
        String s2="ea";
        Integer i1=1;
        Integer i2=1;
        Integer i3=200;
        Integer i4=200;
        System.out.println("s1==s2::"+(s1==s2));
        System.out.println("i1==i2::"+(i1==i2));
        System.out.println("i3==i4::"+(i3==i4));

    }
}