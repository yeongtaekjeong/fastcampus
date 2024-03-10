package com.fastcampus.de.java.clip11_quiz;

public class Person {
    String name;
    int age;
    int x, y;
    int speed;

    public Person(String name, int age, int x, int y, int speed) {
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public Person(String name, int age, int speed) {
        this(name, age, 0, 0, speed);
    }

    public String getLocation() {
        return "(" + x + ", " + y + ")";
    }

    public void printWhoAmI() {
        System.out.println("My name is " + name + " and My age is " + age);
    }
}
