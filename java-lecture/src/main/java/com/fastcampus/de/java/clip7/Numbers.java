package com.fastcampus.de.java.clip7;

public class Numbers {
    public static void main(String[] args) {
        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 123456L;
        System.out.println(b);

        float c = 5.5F;
        System.out.println(c);

        double d = 9.12313231342432424242d;
        System.out.println(d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println("========= default ==========");
        Defaults defaults = new Defaults();
        System.out.println(defaults.shortDefault);
        System.out.println(defaults.intDefault);
        System.out.println(defaults.longDefault);
        System.out.println(defaults.floatDefault);
        System.out.println(defaults.doubleDefault);
    }

    static class Defaults {
        short shortDefault;
        int intDefault;
        long longDefault;
        float floatDefault;
        double doubleDefault;
    }
}
