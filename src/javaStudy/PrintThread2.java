package javaStudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class PrintThread2 extends Thread {
    public void run() {
        while(true) {
            System.out.println("실행 중");
            if(Thread.interrupted()) {
                break;
            }
        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}