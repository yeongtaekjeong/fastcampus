package com.fastcampus.de.java.clip7;

public class Byte {
    public static void main(String[] args) {
        byte b = 'd';
        System.out.println(b);

        Defaults defaults = new Defaults();
        System.out.println(defaults.byteDefault);
    }

    static class Defaults {
        byte byteDefault;
    }
}
