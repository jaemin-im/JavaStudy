package javaStudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
            break;
        }
        save();
    }
}
