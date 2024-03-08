package com.fastcampus.de.java.clip11_5_1;

import com.fastcampus.de.java.clip11_5.AccessModifierTest;

public class Anomymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        accessModifierTest.messageDefault();
//        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }
}
