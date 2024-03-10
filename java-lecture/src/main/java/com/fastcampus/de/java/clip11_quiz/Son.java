package com.fastcampus.de.java.clip11_quiz;

public class Son extends Person implements Walkable,Runable,Swimable {

    public Son(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void run(int x, int y) {
        printWhoAmI();
        System.out.println("run speed : "+(speed+2));
        this.x = x;
        this.y = y;
        System.out.println("run to " + getLocation());
    }

    @Override
    public void swim(int x, int y) {
        printWhoAmI();
        System.out.println("swim speed : "+(speed+1));
        this.x = x;
        this.y = y;
        System.out.println("swim to " + getLocation());
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("walk speed : "+speed);
        this.x = x;
        this.y = y;
        System.out.println("walked to " + getLocation());
    }
}
