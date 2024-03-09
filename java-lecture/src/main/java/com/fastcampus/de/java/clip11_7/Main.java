package com.fastcampus.de.java.clip11_7;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1,2,3);
        bird.printBread();
        bird.abstractMethod();
        Bird.staticMethod();
        System.out.println(Bird.STATIC_VARIABLE);
    }
}
