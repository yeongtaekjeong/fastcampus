package com.fastcampus.de.java.clip9;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println(score);

        if (score <= 100 && score > 90) {
            System.out.println("A등급 입니다.");
        }
        else if (score <= 90 && score > 80) {
            System.out.println("B등급 입니다.");
        }
        else if (score <= 80 && score > 70) {
            System.out.println("C등급 입니다.");
        }
        else {
            System.out.println("F등급 입니다.");
        }

    }
}
