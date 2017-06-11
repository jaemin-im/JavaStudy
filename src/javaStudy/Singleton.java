package javaStudy;

/**
 * Created by dsm2017 on 2017-06-11.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
}
