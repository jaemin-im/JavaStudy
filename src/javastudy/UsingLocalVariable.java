package javastudy;

/**
 * Created by dsm2017 on 2017-06-16.
 */
public class UsingLocalVariable {
    void method(int arg) { // arg는 final 특성을 가짐
        int localVar = 40;

        // arg = 31;      // final 특성 때문에 수정 불가
        // localVar = 41; // final 특성 때문에 수정 불가

        // 람다식
        MyFunctionalInterface fi = () -> {
            // 로컬 변수 읽기
            System.out.println("arg : " + arg);
            System.out.println("localVar : " + localVar + "\n");
        };
        fi.method();
    }
}
