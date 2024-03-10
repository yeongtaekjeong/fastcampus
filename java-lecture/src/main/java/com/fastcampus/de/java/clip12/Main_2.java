package com.fastcampus.de.java.clip12;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try {
            if (FileValidator.validate(path)) {
                System.out.println(path);
            } else {
                System.out.println(path + "doesn't exist.");
            }
        } catch (IllegalPathAccessError illegalPathAccessError) {
            System.out.println(illegalPathAccessError.getMessage());
            illegalPathAccessError.printStackTrace();
            System.out.println("Program is forced to quit.");
            System.exit(1);
        }
    }
}
