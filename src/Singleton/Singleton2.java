package Singleton;

/**
 * Lazy initialization at the expense of potentially lower concurrency
 * in a multithreaded environment.
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
