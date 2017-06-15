package javastudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
