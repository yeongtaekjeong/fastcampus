package com.fastcampus.de.java.clip11_quiz;

public class Main {
    public static void main(String[] args) {
        Person grandParent = new GrandParent("할아버지", 70);
        Person parent = new Parent("엄마", 50);
        Person son = new Son("아들", 20);

        Person[] people = { grandParent, parent, son };
        System.out.println("활동 시작");
        for (Person person:people) {
            if (person instanceof Walkable) {
                ((Walkable) person).walk(1,1);
                System.out.println("==========================");
            }
            if (person instanceof Runable) {
                ((Runable) person).run(2,2);
                System.out.println("==========================");
            }
            if (person instanceof Swimable) {
                ((Swimable) person).swim(3,-1);
                System.out.println("==========================");
            }
        }
    }
}
