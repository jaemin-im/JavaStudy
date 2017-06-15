package javastudy;

/**
 * Created by dsm2017 on 2017-06-15.
 */
public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) {}
        System.out.println("메인 스레드 종료");
    }
}
