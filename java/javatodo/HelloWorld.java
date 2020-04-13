  
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

/*
* @author brucewoods
* @version 1.0  
*/
public class HelloWorld {
  /**
   * 程序路口
   * 
   * @throws TimeoutException
   * @throws IOException
   * @throws URISyntaxException
   * @throws NoSuchAlgorithmException
   * @throws KeyManagementException
   * 
   */
  public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException,
      IOException, TimeoutException
           {

        // ConnectionFactory  factory=new ConnectionFactory();
        // factory.setUsername("user");
        // factory.setPassword("user");
        // factory.setHost("localhost");
        // factory.setPort(5672);
        // factory.setVirtualHost("/");
        
        // Connection conn = factory.newConnection();

        ConnectionFactory factory = new ConnectionFactory();
        factory.setUri("amqp://test:test@localhost:5672");
        Connection conn = factory.newConnection();
         System.out.println("isOpen:"+conn.isOpen());
        System.out.println("Hello World");
    }
}

 class Person{

}
class Class{

}
