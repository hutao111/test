package test.a.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class study {
    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-M-dd hh:mm:ss")));
//
//
//
//
//
//
//
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.now()));
//
//        System.out.println(Instant.now());




//        Date to Instant
        Instant timestamp = new Date().toInstant();
//Now we can convert Instant to LocalDateTime or other similar classes
        LocalDateTime date = LocalDateTime.ofInstant(timestamp,
                ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
        System.out.println("Date = "+date);
//Calendar to Instant
        Instant time = Calendar.getInstance().toInstant();
        System.out.println(time);
//TimeZone to ZoneId
        ZoneId defaultZone = TimeZone.getDefault().toZoneId();
        System.out.println(defaultZone);
//ZonedDateTime from specific Calendar
        ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
        System.out.println(gregorianCalendarDateTime);
//Date API to Legacy classes
        Date dt = Date.from(Instant.now());
        System.out.println(dt);
        TimeZone tz = TimeZone.getTimeZone(defaultZone);
        System.out.println(tz);
        GregorianCalendar gc = GregorianCalendar.from(gregorianCalendarDateTime);
        System.out.println(gc);


        System.out.println("获取时间戳："+LocalDateTime.now().toInstant(ZoneOffset.ofHours(8)).getEpochSecond());
        System.out.println("获取时间戳："+LocalDateTime.now().toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    }
}
