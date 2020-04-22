package Interview;

import org.junit.Test;

public class Reflection_ClassforName_ClassLoader {
 
    
    @Test
    public  void test(){
        String l="Interview.Line";
        String p="Interview.Point";
        System.out.println("------classloader------");
        testClassLoader(l, p);
        System.out.println("------classforname------");
        testForName(l, p);
    }
    public void testClassLoader(String l,String p){
 
        Class<?> line;
        Class<?> point;
        ClassLoader loader=ClassLoader.getSystemClassLoader();
        try {
            line=loader.loadClass(l);
            point=loader.loadClass(p);

            System.out.println("line::"+line.getName());
            System.out.println("point::"+point.getName());
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
    }
    public void testForName(String l,String p){
        try {
            Class line=Class.forName(l);
            Class point=Class.forName(p);
            System.out.println("line::"+line.getName());
            System.out.println("point::"+point.getName());

        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
    }
    

}


class  Line{
    static{
        System.out.println("static snippet line running");
    }
    public static String staticString=getString();
    private static String getString(){
        System.out.println("private static get string running");
        return "get string";
    }
    public static void staticMethod(){
        System.out.println("static method running");
    }
}

class Point{
    static{
        System.out.println("static snippet point running");
    }
}