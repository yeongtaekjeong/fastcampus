package com.fastcampus.de.java.clip13;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class PeiodExample {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2022,7,10);
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println(Period.between(initialDate, finalDate).getDays());  //getMonths()

        System.out.println(ChronoUnit.DAYS.between(initialDate, finalDate));
    }
}
