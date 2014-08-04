package Singleton;

/**
 * Static block initialization.
 * Some authors[7] refer to a similar solution allowing some pre-processing (e.g. for error-checking).
 * In this sense, the traditional approach could be seen as a particular case of this one,
 * as the class loader would do exactly the same processing.
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