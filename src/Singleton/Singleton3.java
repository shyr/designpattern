package Singleton;

/**
 * Eager initialization.
 *  The instance is not constructed until the class is used.
 *  There is no need to synchronize the getInstance() method,
 *      meaning all threads will see the same instance and no (expensive) locking is required.
 *  The final keyword means that the instance cannot be redefined,
 *      ensuring that one (and only one) instance ever exists.
 */
public class Singleton3 {
    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}
