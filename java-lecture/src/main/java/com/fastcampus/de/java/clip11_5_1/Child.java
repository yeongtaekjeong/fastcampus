package com.fastcampus.de.java.clip11_5_1;

import com.fastcampus.de.java.clip11_5.AccessModifierTest;

public class Child extends AccessModifierTest {
    public void call() {
        this.messageProtected();
        this.messageOutside();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
