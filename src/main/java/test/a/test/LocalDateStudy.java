package test.a.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.*;
import java.util.Date;
import java.util.Locale;

public class LocalDateStudy {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2019,04,12);
        LocalDate localDate2  = LocalDate.parse("2018-02-25");

//        LocalDate localDate3 = LocalDate.parse("2018-9-22 15:33:52",new DateTimeFormatter(""));
//        System.out.println("取得当前时间："+localDate);
//        System.out.println("字符串转化成时间格式："+localDate);
//        System.out.println("字符串转化成时间格式："+localDate3);

//        System.out.println("获取当前月份的第一天："+localDate.with(TemporalAdjusters.firstDayOfMonth()));;
//        System.out.println("获取当前月份的第二天："+localDate.plus(12,  ChronoUnit.YEARS));
//        System.out.println(LocalDate.parse("2017-01-23").with(TemporalAdjusters.firstInMonth(Day)));
        LocalDate localDate3;


//        System.out.println( LocalTime.now());  ;
//        System.out.println(LocalTime.from(ZonedDateTime.now()));
//        System.out.println(ZonedDateTime.now());
//        System.out.println(LocalTime.now().parse("23:56:06",DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2019-01-26T10:15:30+01:00[Europe/Paris]");
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(zonedDateTime));         // 20190126+0100
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(zonedDateTime));         // 2019-01-26
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE.format(zonedDateTime));        // 2019-01-26+01:00
        System.out.println(DateTimeFormatter.ISO_DATE.format(zonedDateTime));               // 2019-01-26+01:00
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(zonedDateTime));         // 10:15:30
        System.out.println(DateTimeFormatter.ISO_OFFSET_TIME.format(zonedDateTime));        // 10:15:30+01:00
        System.out.println(DateTimeFormatter.ISO_TIME.format(zonedDateTime));               // 10:15:30
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime));    // 2019-01-26T10:15:30
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(zonedDateTime));   // 2019-01-26T10:15:30+01:00
        System.out.println(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(zonedDateTime));    // 2019-01-26T10:15:30+01:00[Europe/Paris]
        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(zonedDateTime));          // 2019-01-26T10:15:30+01:00[Europe/Paris]
        System.out.println(DateTimeFormatter.ISO_ORDINAL_DATE.format(zonedDateTime));       // 2019-026+01:00
        System.out.println(DateTimeFormatter.ISO_WEEK_DATE.format(zonedDateTime));          // 2019-W04-6+01:00
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(zonedDateTime));            // 2019-01-26T09:15:30Z
        System.out.println(DateTimeFormatter.RFC_1123_DATE_TIME.format(zonedDateTime));     // Sat, 26 Jan 2019 10:15:30 +0100

        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).format(zonedDateTime));          // 上午10时15分30秒 CET
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG).format(zonedDateTime));          // 上午10时15分30秒
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(zonedDateTime));        // 10:15:30
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(zonedDateTime));         // 上午10:15

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime));          // 2019年1月26日 星期六
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(zonedDateTime));          // 2019年1月26日
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTime));        // 2019-1-26
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(zonedDateTime));         // 19-1-26

        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zonedDateTime));      // 2019年1月26日 星期六 上午10时15分30秒 CET
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(zonedDateTime));      // 2019年1月26日 上午10时15分30秒
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(zonedDateTime));    // 2019-1-26 10:15:30
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(zonedDateTime));     // 19-1-26 上午10:15
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM).format(zonedDateTime));  // 2019年1月26日 星期六 10:15:30

        TemporalAccessor parsed = DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse("2019-01-26T10:15:30");
        LocalTime time = parsed.query(LocalTime::from);
        Period extraDays = parsed.query(DateTimeFormatter.parsedExcessDays());
        System.out.println(time);       // 10:15:30
        System.out.println(extraDays);  // P0D

        Boolean query = parsed.query(DateTimeFormatter.parsedLeapSecond());
        System.out.println(query);      // false


// 自定义格式化格式
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = dateTimeFormatter.format(zonedDateTime);
        String format2 = dateTimeFormatter.format(localDateTime);
        System.out.println(format1);    // 2019-01-26 10:15:30
        System.out.println(format2);    // 2019-01-26 13:41:56

// Locale语言环境
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(localDateTime)); // 2019-01-26 13:49:33
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.KOREAN).format(localDateTime));// 2019-01-26 13:49:33

// 得到{},ISO resolved to 2019-01-26T10:15:30对象
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse(format1);
        int year = temporalAccessor.get(ChronoField.YEAR);
        int hour = temporalAccessor.get(ChronoField.CLOCK_HOUR_OF_DAY);
        System.out.println(temporalAccessor);
        System.out.println(year);   // 2019
        System.out.println(hour);   // 10

// 另一种格式化和解析
        String format3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format3);    // 2019-01-26 14:14:01
        LocalDateTime parse = LocalDateTime.parse("2019-01-26T10:15:30");// 日期字符串转为日期
        System.out.println(parse);      // 2019-01-26T10:15:30

        String format4 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E"));
        LocalDateTime parse2 = LocalDateTime.parse(format4,DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E"));
        System.out.println(parse2);     // 2019-01-26T14:25:30

















        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println("获取当前时间含时分秒:"+dateTime);



    }
}
