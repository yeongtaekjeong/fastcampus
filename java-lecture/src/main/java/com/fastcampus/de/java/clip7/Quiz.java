package com.fastcampus.de.java.clip7;

public class Quiz {
    public static void main(String[] args) {
        String name = "Jeong Yeongtaek";
        int age = 29;
        System.out.println("name : " + name);
        System.out.println("age : " + age);

        int[] quizArray = new int[]{10,20,30};
        System.out.println("last_value : " + quizArray[2]);
        System.out.println("last_value : " + quizArray[quizArray.length - 1]);
    }
}
