package javastudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class UsingThisExample {
    public static void main(String... args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
