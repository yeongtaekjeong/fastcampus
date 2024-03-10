package com.fastcampus.de.java.clip12;

public class MethodExceptionSignature {
    static void methodThrowsException() throws Exception {

    }

    static void methodThrowsRuntimeException() throws RuntimeException {

    }

    public static void main(String[] args) {
        methodThrowsRuntimeException();
        try {
            methodThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
