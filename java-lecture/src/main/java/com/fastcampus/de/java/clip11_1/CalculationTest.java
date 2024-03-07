package com.fastcampus.de.java.clip11_1;

public class CalculationTest {
    static class Calculation {
        int extra = 1;
        static int add(int x, int y) {
            int result = x + y;
            return result;
        }

        int subtract(int x, int y) {
            return x - y - extra;
        }
    }
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println("100 + 90 = " + calculation.add(100,90));
        System.out.println("100 + 90 = " + Calculation.add(100,90));
        System.out.println("100 - 90 = " + calculation.subtract(100,90));
    }
}
