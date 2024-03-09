package com.fastcampus.de.java.clip11_7;

public interface Bird {

    String STATIC_VARIABLE = "STATIC";
    void fly(int x, int y, int z);

    default void printBread() {
        System.out.println("나는 새 중에 " + getBread() + " 입니다.");
    }

    String getBread();

    static void staticMethod() {
        System.out.println("This is static method");
    }

    abstract void abstractMethod();
}
