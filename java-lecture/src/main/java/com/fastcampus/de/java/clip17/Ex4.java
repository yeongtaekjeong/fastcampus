package com.fastcampus.de.java.clip17;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> numArr = Arrays.asList(1, 3, 5, 7, 9, 10);
        int result = numArr.stream()
                .reduce(0, Ex4::sum);
        System.out.println(result);

        String[] arr = {"데이터를", "배우는", "가장 쉬운", "방법은", "fastcampus", "초격자 데이터 엔지니어링"};
        List<String> strArr = Arrays.asList(arr);
        String result2 = strArr.stream()
                .reduce("수업 설명 ", (prev, next) -> prev + next + " ");
        System.out.println(result2);
    }
    public static int sum(int a, int b) {
        System.out.println("a = "+ a + ", b = " + b);
        return a+b;
    }
}
