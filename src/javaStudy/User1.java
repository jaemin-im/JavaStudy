package javaStudy;

/**
 * Created by dsm2017 on 2017-06-14.
 */

public class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run() {
        calculator.setMemory(100);
    }
}
