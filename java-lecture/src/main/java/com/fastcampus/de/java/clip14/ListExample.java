package com.fastcampus.de.java.clip14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(10);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(4);
        System.out.println(list);

        int[] intArr = {1,5,4,11,10};
        intArr[0] = 1;
        intArr[1] = 5;
        intArr[2] = 4;

        int[] intArr2 = new int[5];
        intArr2[0] = intArr[0];
        intArr2[1] = intArr[1];
        intArr2[2] = intArr[2];
        intArr2[3] = 11;
        intArr2[4] = 10;

        for (int i=1;i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int cur:list) {
            System.out.println(cur);
        }



    }
}
