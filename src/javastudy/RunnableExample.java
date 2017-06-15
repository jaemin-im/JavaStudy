package javastudy;

import com.sun.deploy.security.ruleset.RuleAction;

/**
 * Created by dsm2017 on 2017-06-16.
 */
public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i=0;i<10;i++) {
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
