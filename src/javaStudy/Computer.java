package javaStudy;

/**
 * Created by dsm2017 on 2017-06-11.
 */
public class Computer {
    int sum1(int[] values) { // 매개변수의 개수를 모를 때 배열 또는 ...을 매개변수로 지정
        int sum =0;
        for (int i =0 ;i<values.length;i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += values[i];
        }
        return sum;
    }
}
