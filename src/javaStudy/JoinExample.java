package javaStudy;

/**
 * Created by dsm2017 on 2017-06-14.
 */
public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch(InterruptedException e) {}

        System.out.println("1~100의 합 : " + sumThread.getSum());
    }
}
