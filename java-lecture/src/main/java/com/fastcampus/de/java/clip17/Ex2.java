package com.fastcampus.de.java.clip17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        String[] arr = {"데이터를", "배우는", "가장 쉬운", "방법은", "fastcampus", "초격자 데이터 엔지니어링"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(param -> System.out.println(param+" ")

        );
        System.out.println();
    }
}
