package Redis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class DoTest {
    
    Jedis  j=new Jedis("192.168.146.146",6379 );
    @Test
    public  void setKey() throws InterruptedException {
     
       // j.connect();
      
        
        j.set("testKey", "testHello");


        Thread.sleep(500);
        
        String receive=j.get("testKey");
        

        assertEquals("testHello", receive, "receive value");
    }
  
    @Test
  public void  setList(){
      j.connect();
     j.rpush("list", "john");
     j.rpush("list", "tom");
     j.rpush("list", "lane");

      var out=j.lrange("list",0,2);
      j.close();
     System.out.println(out);


  }
  
    @Test
  public void  setSet(){
      j.connect();
     j.set("string", "key");
     j.set("string", "key2");
     j.set("string", "key3");

     var out= j.smembers("string");
      j.close();
     System.out.println(out);


  }

     
}