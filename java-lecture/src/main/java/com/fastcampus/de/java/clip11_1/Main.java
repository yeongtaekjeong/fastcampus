package com.fastcampus.de.java.clip11_1;

public class Main {
    static class Person {
        String name;
        String country;
        int age;

        Person(String name, String country, int age) {
            this.name = name;
            this.country = country;
//            this.age = age;
            if("대한민국".equals(country)) {
                this.age = age+1;
            } else {
                this.age = age;
            }
        }

        Person() {
        }
    }

    public static void main(String[] args) {
        Person minsu = new Person("민수","대한민국",10);  // 생성자 함수를 호출, class에서 기본적으로 생성자를 가지고 있음.
//        minsu.name = "민수";
//        minsu.country = "대한민국";
//        minsu.age = 10;

        Person paul = new Person("Paul","America",40);
//        paul.name = "Paul";
//        paul.country = "America";
//        paul.age = 40;

        Person[] persons = {minsu, paul};
        for (Person person:persons){
            System.out.println("<자기소개>");
            System.out.println("안녕하세요. 저는 "+person.name+"에서 태어났습니다.");
            System.out.println("저는 "+person.country+"에서 태어났습니다.");
            System.out.println("저는 "+person.age+"살 입니다.");
        }
    }
}


