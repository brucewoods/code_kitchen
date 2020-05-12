package Interview;
public class FinalizeEscapseGC {

    public static FinalizeEscapseGC gcObject = null;
    
    public static FinalizeEscapseGC fe = null;
        
    public void isAlive() {
    
    System.out.println("I am still Alive");
    
    }
    @Override
    
    protected void finalize() throws Throwable {
    
    super.finalize();
    
    System.out.println("finalize method excute");
    
    FinalizeEscapseGC.gcObject = this;
    
    }
    public static void main(String[] args) throws InterruptedException {
    
    gcObject = new FinalizeEscapseGC();
    
    gcObject = null;
    
    System.gc();//因为finalize方法被重写了,并且还没有被调用,所以此时会调用finalize方法
    
    Thread.sleep(500);
    
    if (gcObject != null) {
    
    gcObject.isAlive();
    
    } else {
    
    System.out.println("gcObject is dead");
    
    }
    
    gcObject = null;
    
    System.gc();//此时因为finalize方法已经被调用了,所以不会再调用;该对象会被直接回收
    
    Thread.sleep(500);
    
    if (gcObject != null) {
    
    gcObject.isAlive();
    
    } else {
    
    System.out.println("gcObject is dead");
    
    }
    
    }
    
    }