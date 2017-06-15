package javaStudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
}
