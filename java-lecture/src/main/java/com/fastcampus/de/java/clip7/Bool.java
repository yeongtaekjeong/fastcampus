package com.fastcampus.de.java.clip7;

public class Bool {
    public static void main(String[] args) {
        boolean fact = true;
        System.out.println(fact);
        System.out.println("ture");

        Defaults defaults = new Defaults();
        System.out.println(defaults.boolDefault);
    }

    static class Defaults {
        boolean boolDefault;
    }
}
