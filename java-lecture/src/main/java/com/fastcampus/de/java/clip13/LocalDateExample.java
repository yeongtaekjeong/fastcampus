package com.fastcampus.de.java.clip13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(LocalDate.of(2022,2,20));
        System.out.println(LocalDate.parse("2022-02-26"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);
        DayOfWeek sunday = LocalDate.now().getDayOfWeek();
        System.out.println(sunday);

        int twelve = LocalDate.parse("2022-06-15").getDayOfMonth();
        System.out.println(twelve);  //날짜
        System.out.println(LocalDate.now().isLeapYear()); //윤년확인

        LocalDate.parse("2022-06-22").isAfter(LocalDate.parse("2022-06-11"));

        LocalDateTime begigingOfDay = LocalDate.parse("2022-06-12").atStartOfDay();
        System.out.println(begigingOfDay);
        LocalDate firstDayOfMonth = LocalDate.parse("2022-06-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
    }
}
