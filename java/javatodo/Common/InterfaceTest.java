package Common;

 interface InterfaceTest {

       String test();
}
 interface  InterfaceTest2{
     String test2();
 }
abstract class AbClass{

}
abstract class AbClass2{

}
class  ImpClass extends AbClass implements InterfaceTest,InterfaceTest2{

    @Override
    public String test2() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String test() {
        // TODO Auto-generated method stub
        return null;
    }
    
}