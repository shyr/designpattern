package Singleton;

/**
 * Static block initialization.
 */
public class Singleton4 {
    private static final Singleton4 instance;

    static {
        try {
            instance = new Singleton4();
        } catch (Exception e) {
            throw new RuntimeException("Darn, an error occurred!", e);
        }
    }

    public static Singleton4 getInstance() {
        return instance;
    }

    private Singleton4() {
        // ....
    }
}