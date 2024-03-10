package com.fastcampus.de.java.clip12;

public class Main {
    public static void main(String[] args) {
        ArrayCaluculation arrayCaluculation = new ArrayCaluculation();

        try {
//            System.out.println("2 / 1 = " + arrayCaluculation.divide(2, 1));
//            System.out.println("1 / 0 = " + arrayCaluculation.divide(1, 0));
            System.out.println("Try to divide using out of index element = "
                    + arrayCaluculation.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산입니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 배열의 index 범위는 0부터 "+(arrayCaluculation.arr.length-1) + "입니다.");
        }

    }
}
