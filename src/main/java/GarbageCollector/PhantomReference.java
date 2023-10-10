package GarbageCollector;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/**
 * Программа логирует информацию перед удалением объекта PhantomReference
 */
public class PhantomReference {
    public PhantomReference(WeakReference weakReference, Object o) {

    }

    public static void main(String[] args) {
        Object object = new Object();
        WeakReference weakReference = new WeakReference(object);
        PhantomReference phantomReference = new PhantomReference(weakReference, new Object());
        System.out.println("Object is still reachable: " + weakReference.get() + ", phantomReference: " + phantomReference);

        // Тригерим Garbage Collector
        System.gc();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After garbage collection: " + weakReference.get());
    }
}