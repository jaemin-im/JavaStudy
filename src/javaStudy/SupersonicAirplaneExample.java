package javaStudy;

/**
 * Created by dsm2017 on 2017-06-12.
 */
public class SupersonicAirplaneExample {
    public static void main(String args[]) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
