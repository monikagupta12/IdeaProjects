package DateAndTime;

import org.w3c.dom.ls.LSOutput;

import java.time.*;
import java.time.chrono.Era;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateClass {
    public static void main(String[] args) {

        System.out.println("Max: "+LocalDate.MAX);
        System.out.println("Min: "+LocalDate.MIN);
        System.out.println("---------");
        //1 now()
        LocalDate d1=LocalDate.now();
        System.out.println("Today Date:  "+d1);
        System.out.println("------");

        //2 now()
        Clock c1=Clock.systemDefaultZone();
        System.out.println(c1);

        LocalDate d2=LocalDate.now(c1);
        System.out.println("Today Date:  "+d2);

        System.out.println("------");
        //3 now()
        ZoneId z1=ZoneId.of("Asia/Calcutta");
        System.out.println(z1);
       /* for (String id:ZoneId.getAvailableZoneIds()){
            System.out.println(id);
        }*/
        LocalDate d3=LocalDate.now(ZoneId.of("Europe/Athens"));
        System.out.println("Today Date:  "+d3);
        System.out.println("------");


        // of
        LocalDate d4=LocalDate.of(2024, Month.OCTOBER,9);
        System.out.println("Date:  "+d4);
        LocalDate d_4=LocalDate.of(2024, 8,9);
        System.out.println("Date:  "+d_4);
        System.out.println("------");
        //parse

        LocalDate d5=LocalDate.parse("2024-08-09");
        System.out.println("Date:  "+d5);
        System.out.println("------");

        //plus
        LocalDate d6=d1.plus(1, ChronoUnit.DAYS);
        System.out.println("Plus Date: "+d6);
        System.out.println("------");



        //plusDays(),plusWeek(),plusMonth(),plusYear();

        LocalDate d7=d1.plusDays(1);
        System.out.println(d1+" 1 Plus Date: "+d6);

        if(d6.equals(d7)){
            System.out.println("equal Date");
        }
        LocalDate d8=d1.plusWeeks(1);
        System.out.println(d1+" 1 Plus Week: "+d8);
        LocalDate d9=d1.plusMonths(3);
        System.out.println(d1+" 3 Plus Month: "+d9);
        LocalDate d10=d1.plusYears(1);
        System.out.println(d1+"1 Plus year: "+d10);
        System.out.println("------");

        //minus()
        LocalDate d11=d1.minus(1,ChronoUnit.DAYS);
        System.out.println(d1+" 1 Day Minus: "+d11);
        System.out.println("------");

        //minusDays(),minusWeek(),minusMonth(),miunsYear()
        LocalDate d12=d1.minusDays(2);
        System.out.println(d1+" 2 Day Minus: "+d12);
        LocalDate d13=d1.minusWeeks(2);
        System.out.println(d1+" 2 Week Minus: "+d13);
        LocalDate d14=d1.minusMonths(3);
        System.out.println(d1+" 3 Month Minus: "+d14);
        LocalDate d15=d1.plusYears(1);
        System.out.println(d1+" 1 Year Minus: "+d15);
        System.out.println("------");

        //after(),before()
        boolean val=d12.isBefore(d1);
        System.out.println(val);
        boolean val2=d12.isAfter(d1);
        System.out.println(val2);
        System.out.println("------");

        // isLeapYear()
        boolean val3=d1.isLeapYear();
        System.out.println(val3);
        System.out.println("------");

        //DayofWeek(),DayofMonth(),DayOfYear();
        DayOfWeek weekDay=d1.getDayOfWeek();
        System.out.println("WeekDay: "+weekDay);
        int mathDay=d1.getMonthValue();
        System.out.println("Month Day: "+mathDay);
        int yearDay=d1.getDayOfYear();
        System.out.println("Year Day: "+yearDay);
        System.out.println(("------------"));

        //dayOfMonth(),getMonthValue().getYear()
        int day1=d1.getDayOfMonth();
        System.out.println(day1);
        int month1=d1.getMonthValue();
        System.out.println(month1);
        int year= d1.getYear();
        System.out.println(year);
        System.out.println("---------");

        //getDayOfWeek(),getMonth()
        DayOfWeek day=d1.getDayOfWeek();
        System.out.println(day);
        Month month=d1.getMonth();
        System.out.println(month);
        System.out.println("------");

    //LengthOfMonth,LengthOfYear
        int l1=d1.lengthOfMonth();
        System.out.println(l1);
        int l2=d1.lengthOfYear();
        System.out.println(l2);
        System.out.println("-----");

        //start.ofDay();
        LocalDateTime d17= d1.atStartOfDay();
        System.out.println(d17);
        System.out.println("-------");

        //with()
        LocalDate d18=d1.with(TemporalAdjusters
                .firstDayOfMonth());
        System.out.println(d18);
        System.out.println("------");

        //withYear(),withLMonth(),withDate()
        LocalDate d19=d1.withYear(2000);
        System.out.println(d19);
        LocalDate d20=d1.withMonth(1);
        System.out.println(d20);
        LocalDate d21=d1.withDayOfMonth(1);
        System.out.println(d21);
        System.out.println("------");


        //atTime()
        LocalDateTime d22=d1.atTime(LocalTime.now());
        System.out.println(d22);
        LocalDateTime d23=d1.atTime(00,00);
        System.out.println(d23);
        System.out.println("---------");


        //Formater
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("\"d-MMM-yyyy\"");
        String date= d1.format(formatter);
        System.out.println(date);
        System.out.println("--------");

        //ofYearDay()
        LocalDate dx=LocalDate.ofYearDay(2000,24);
        System.out.println(dx);

        //ofEpoucDay
        LocalDate dy=LocalDate.ofEpochDay(10);
        System.out.println(dy);





    }
}
