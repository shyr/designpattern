package Singleton;

/**
 * Initialization On Demand Holder Idiom.
 * As lazy as possible, and works in all known versions of Java.
 * It takes advantage of language guarantees about class initialization,
 * and will therefore work correctly in all Java-compliant compilers and virtual machines.
 *
 * The nested class is referenced no earlier (and therefore loaded no earlier by the class loader)
 * than the moment that getInstance() is called.
 * Thus, this solution is thread-safe without requiring special language constructs (i.e. volatile or synchronized).
 */
public class Singleton5 {
    // Private constructor prevents instantiation from other classes
    private Singleton5() {
    }

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
