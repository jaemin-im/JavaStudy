package javaStudy;

/**
 * Created by dsm2017 on 2017-06-14.
 */
public class ThreadB extends Thread {
    public void run() {
        for(int i=0;i<2;i++) {
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
