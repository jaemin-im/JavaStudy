package javaStudy;

/**
 * Created by dsm2017 on 2017-06-11.
 */
public class Car {
    // 필드 - Field
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;

    // 생성자 - Constructor
    Car() {}

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
