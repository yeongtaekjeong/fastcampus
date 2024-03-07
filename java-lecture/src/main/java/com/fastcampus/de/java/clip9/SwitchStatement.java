package com.fastcampus.de.java.clip9;

public class SwitchStatement {
    enum Score {
        A,B,C,D,E;
    }
    public static void main(String[] args) {

        Score input = Score.A;
        switch (input){
            case A:
                System.out.println("score : 4.0");
                break;
            case B:
                System.out.println("score : 3.0");
                break;
            case C:
                System.out.println("score : 2.0");
                break;
            default:
                System.out.println("score : 2.0");
                break;
        }

        char score = 'A';
        switch (score) {
            case 'A':
                System.out.println("score : 4.0");
                break;
            case 'B':
                System.out.println("score : 3.0");
                break;
            case 'C':
                System.out.println("score : 2.0");
                break;
            default:
                System.out.println("out of scope");
                break;

        }
    }
}
