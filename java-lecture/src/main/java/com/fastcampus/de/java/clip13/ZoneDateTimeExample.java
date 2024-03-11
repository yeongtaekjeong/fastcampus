package com.fastcampus.de.java.clip13;

import java.time.*;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Seoul");  //Europe/Paris
        System.out.println(zoneId);

//        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
        System.out.println(ZonedDateTime.parse("2024-03-12T00:43:16.007+01:00[Europe/Paris]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);
    }
}
