package Singleton;

/**
 * Created by Sungho on 2014-08-04.
 */
public class Singleton5 {
    // Private constructor prevents instantiation from other classes
    private Singleton5() { }

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
