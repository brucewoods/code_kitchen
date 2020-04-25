package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Implement_Own_Cache {

    @Test
    public void testCache() throws InterruptedException, ExecutionException {
    final String  key="id";
    //不设置过期
    System.out.println("=============不设置过期=============");
    Cache.put(key, "234");
    System.out.println("key:"+key+"value:"+Cache.get(key));
    System.out.println("remove key:"+key+"value:"+Cache.remove(key));
    System.out.println("after removing key:"+key+"value:"+Cache.get(key));
    //设置过期
    System.out.println("=============设置过期=============");
    Cache.put(key, "hello world",1000);
    System.out.println("key:"+key+"value:"+Cache.get(key));
    Thread.sleep(2000);
    System.out.println("after 2s key:"+key+"value:"+Cache.get(key));

    //并发测试

    final ExecutorService  service=Executors.newFixedThreadPool(10);
    final Future[] futures=new Future[10];
    /***添加** */
    { 
        final long start=System.currentTimeMillis();
        for(int j=0;j<10;j++){
            futures[j]=service.submit(()->{
                for(int i=0;i<100000;i++){
                    Cache.put(Thread.currentThread().getId()+key+i, i,300000);
                }
            });
        }

       for (final Future f: futures) 
           f.get();
       System.out.printf("put cost time %dms \n",System.currentTimeMillis()-start);    
           
       

    }

    /*******查询 */

    {
        final long start=System.currentTimeMillis();
        for(int j=0;j<10;j++){
          futures[j]=service.submit(()->{
                for(int i=0;i<100000;i++){
                    Cache.get(Thread.currentThread().getId()+key+i);
                }

          }); }
        for (final Future future : futures) {
            future.get();
            
        }
        System.out.printf("get cost time %dms\n",System.currentTimeMillis()-start);

    }
    System.out.println("total cache::"+Cache.size());

    





    }

}

class Cache{
    //键位值对集合
    private final static  Map<String,Entity> map=new HashMap<>();
   //定时器线程池,用于清除过期缓存
    private final static ScheduledExecutorService executor=Executors.newSingleThreadScheduledExecutor();

    public synchronized static void put(final String key,final Object value){
        put(key, value,0);
    }
    public synchronized static void put(final String key,final Object value,final long expire){
       
         Cache.remove(key);

         if(expire>0){
           final Future future=executor.schedule(new Runnable(){
           
               @Override
               public void run() {
                   synchronized(Cache.class){
                       map.remove(key);
                   }
                 
                   
               }
           }, expire, TimeUnit.MILLISECONDS);
           map.put(key,new Entity(value, future));

         }else{
             map.put(key,new Entity(value, null));
         }


    }
    
   
   

    public synchronized static  Object get(final String key){
        final Entity entity=map.get(key);
        return entity==null?null:entity.getValue();
    }

    public synchronized static  <T> T get(final String key,final Class<T> clazz){
        return clazz.cast(Cache.get(key ));
    }
    public synchronized static Object remove(final String key){
        final Entity entity=map.remove(key);
        if(entity==null) return null;
        final Future future=entity.getFuture();
        if(future!=null) future.cancel(true);
        return entity.getValue();
    }
    public synchronized static int size(){
        return map.size();
    }
    private static class Entity{
        private final Object value;
        private final Future future;
        public Entity(final Object value ,final Future future){
            this.value=value;
            this.future=future;
        }
        public Object getValue(){
            return value;
        }
        public Future getFuture(){
            return future;
        }
    }
}