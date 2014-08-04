package Singleton;

/**
 * Lazy initialization.
 * Double-checked locking
 * should not be used prior to J2SE 5.0, as it is vulnerable to subtle bugs.
 * The problem is that an out-of-order write may allow the instance reference
 * to be returned before the Singleton constructor is executed.
 */
public class Singleton1 {
    private static volatile Singleton1 instance = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
