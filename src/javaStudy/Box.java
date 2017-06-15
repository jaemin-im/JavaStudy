package javaStudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class Box<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
