package com.fastcampus.de.java.clip10;

public class WhileStatement {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 10) {
            sum += i + 1;
            if (sum > 50) {
                if (sum < 60) {
                    continue;
                }
                break;
            }
        }
        System.out.println("final sum: "+sum);
    }
}
