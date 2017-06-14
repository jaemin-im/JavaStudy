package javaStudy;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_EXCLUSIONPeer;

import java.awt.*;

/**
 * Created by dsm2017 on 2017-06-14.
 */
public class BeepTask implements Runnable {
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0;i<5;i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}
