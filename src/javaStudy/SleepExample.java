package javaStudy;

/**
 * Created by dsm2017 on 2017-06-14.
 */

import java.awt.Toolkit;
public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0;i<10;i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {}
        }
    }
}
