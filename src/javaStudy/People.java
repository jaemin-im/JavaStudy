package javaStudy;

/**
 * Created by dsm2017 on 2017-06-11.
 */
public class People {
    final String nation = "Korea";
    final String ssn;
    String name;

    public People(String ssn, String name) {
        this.ssn = ssn; // 생성자에서도 final 필드를 초기화할 수 있다
        this.name = name;
    }
}
