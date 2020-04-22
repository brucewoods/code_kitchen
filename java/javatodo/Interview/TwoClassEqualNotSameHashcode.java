package Interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;
public  class TwoClassEqualNotSameHashcode{
  

    /*
两个对象值相同(x.equals(y) == true)，但却可有不同的hash code，这句话对不对?
    
 

对也不对。。 如果此对象重写了equals方法，那么可能出现这两个对象的equals相同，而hashcode不同。因此可以说它是对的。 但是，如果此对象继承Object，没有重写equals方法，那么就使用Object的equals方法，Object对象的equals方法默认是用==实现的，那么如果equals相同，hashcode一定相同。
*/
     @Test
    public void TestEqual(){
         B b=new B();
         C c=new C();
         System.out.println(b.hashCode()+","+c.hashCode());
        assertEquals(true,b.equals(c), "b==2?");
    }

}
 
class B  {
  @Override
  public boolean equals(Object o){
      return true;

  }
}
class C {

}