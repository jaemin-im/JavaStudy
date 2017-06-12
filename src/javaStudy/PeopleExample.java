package javaStudy;

/**
 * Created by dsm2017 on 2017-06-11.
 */
public class PeopleExample {
    public static void main(String[] args) {
        People p1 = new People("123456-1234567", "계백");

        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation = "usa";
        //p1.ssn = "654321-77654321";
        p1.name = "을지문덕"; // final 필드는 값 수정 불가
    }
}
