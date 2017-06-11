package javaStudy;

/**
 * Created by dsm2017 on 2017-06-11.
 */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        myCar.run();
        yourCar.run();
    }
}
