package javaStudy;

/**
 * Created by dsm2017 on 2017-06-12.
 */
public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
