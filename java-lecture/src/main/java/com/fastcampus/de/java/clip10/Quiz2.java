package com.fastcampus.de.java.clip10;

public class Quiz2 {
    public static void main(String[] args) {
        int r1 = 0;
        int r2 = 0;

        for (int i=0;i<30;i++) {
            if (i%2==1){
                r1 += i+1;
            }
            else {
                r2 += i+1;
            }
        }

        System.out.println("30이하 홀수의 합 : "+r1);
        System.out.println("30이하 짝수의 합 : "+r2);
    }
}
