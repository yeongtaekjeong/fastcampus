package com.fastcampus.de.java.clip16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("korea","Japan", "China", "France", "England"));
        Stream<String> stream = stringList.stream();
        stream.map((str) -> {
            System.out.println(str);
            System.out.println("logic");
            return str.toUpperCase();
        }).forEach(System.out::println);

        // ---> 위와 같은 기능
        stream.map(Main::logic).forEach(System.out::println);

//        stringList.forEach((string) ->
//          System.out.println(string));
    }

    public static String logic(String param) {
        System.out.println(param);
        System.out.println("logic");
        return param.toUpperCase();
    }
}
