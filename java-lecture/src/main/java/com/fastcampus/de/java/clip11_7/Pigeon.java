package com.fastcampus.de.java.clip11_7;

public class Pigeon implements Bird, Pat {
    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    @Override
    public String getBread() {
        return "비둘기";
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is abstract method implemented from Pigeon");
    }

    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");
    }

    @Override
    public String getHome() {
        return "도곡동";
    }
}
