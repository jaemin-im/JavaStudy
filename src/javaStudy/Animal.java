package javaStudy;

/**
 * Created by dsm2017 on 2017-06-12.
 */
public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}