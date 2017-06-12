package javaStudy;

/**
 * Created by dsm2017 on 2017-06-12.
 */
public class Student extends People {
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
