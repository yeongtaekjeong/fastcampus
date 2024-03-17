package com.fastcampus.de.java.clip17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김정우","김호정","이하늘","이정희","박정우","박지현","정우석","이지수");
        List<String> result = list.stream()
                .filter(item -> item.startsWith("이"))
                .collect(Collectors.toList());
        //.count()
        System.out.println(result.size());
    }
}
