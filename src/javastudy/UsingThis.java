package javastudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class UsingThis {
    public int outterField = 100;

    class Inner {
        int innerField = 20;

        void method() {
            // 람다식
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("outterField : " + UsingThis.this.outterField + "\n");

                System.out.println("innerField : " + innerField);
                System.out.println("innerField : " + this.innerField + "\n");
            };
            fi.method();
        }
    }
}
