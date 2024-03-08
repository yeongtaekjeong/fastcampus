package com.fastcampus.de.java.clip11_5;

public class Anomymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        accessModifierTest.messageDefault();
        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }

    public static void main(String[] args) {
        Anomymous anomymous = new Anomymous();
        anomymous.call();
    }
}
