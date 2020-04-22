package Interview;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import org.junit.Test;

public class How_Many_Reference {
  
    public  void StrongReference(){
        final Object obj = new Object();

    }

    public How_Many_Reference getNew() {
        return new How_Many_Reference();
    }

    public void testSoftRef() {
        final SoftReference<How_Many_Reference> sf = new SoftReference<How_Many_Reference>(getNew());
        sf.get();
    }

    @Test
    public void testWeakRef() {
        final WeakReference<How_Many_Reference> wrf = new WeakReference<How_Many_Reference>(getNew());
        int counter = 0;
        while (wrf.get() != null) {
            counter++;
            // System.gc();
            System.out.println("Weak Reference delete after::" + counter + wrf.get());
        }
    }

    @Test
    public void testPhamtomRef() throws InterruptedException {
        final ReferenceQueue queu = new ReferenceQueue<>();
        final PhantomReference<How_Many_Reference> ph = new PhantomReference<How_Many_Reference>(getNew(), queu);
        System.gc();
        queu.remove();
        System.out.println("Phamtom reference delete after");
    }


}