package DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.util.Calendar.JULY;

public class DateTimeClass {
    public static void main(String[] args) {
        System.out.println("Max: "+LocalDateTime.MAX);
        System.out.println("Min; "+LocalDateTime.MIN);
        //now()
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        Clock clock=Clock.systemDefaultZone();
        LocalDateTime dt1=LocalDateTime.now(clock);
        System.out.println(dt1);
        ZoneId z=ZoneId.of("Asia/Calcutta");
        LocalDateTime dt2=LocalDateTime.now(z);
        System.out.println(dt2);

        //of
        LocalDateTime dt3=LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(dt3);
        LocalDateTime dt4=LocalDateTime.of(2000,9,23,4,30,19,700000);
        System.out.println(dt4);
        LocalDateTime dt5=LocalDateTime.of(2000,9,23,4,30,19);
        System.out.println(dt5);
        LocalDateTime dt6=LocalDateTime.of(2000,9,23,4,30);
        System.out.println(dt6);
        LocalDateTime dt7=LocalDateTime.of(2000,Month.JANUARY,23,4,30,19,700000);
        System.out.println(dt7);
        LocalDateTime dt8=LocalDateTime.of(2000,Month.FEBRUARY,23,4,30,19);
        System.out.println(dt8);
        LocalDateTime dt9=LocalDateTime.of(2000,Month.APRIL,23,4,30);
        System.out.println(dt9);

        //parse()
        LocalDateTime dt10=LocalDateTime.parse("2000-08-09T01:15:30.40000");
        System.out.println(dt10);

        //getDate() getTime()
        LocalDate date=dt.toLocalDate();
        System.out.println(date);
        LocalTime time=dt.toLocalTime();
        System.out.println(time);
        System.out.println("------");

        //getvalue
        System.out.println(dt);
        int d=dt.getDayOfMonth();
        System.out.println("date"+d);
        int m=dt.getMonthValue();
        System.out.println("Month"+m);
        int y=dt.getYear();
        System.out.println("year"+y);
        int h=dt.getHour();
        System.out.println("hour"+h);
        int mi=dt.getMinute();
        System.out.println("Minute"+mi);
        int s=dt.getSecond();
        System.out.println("Second"+s);
        long ns=dt.getNano();
        System.out.println("NanoSec"+ns);

        DayOfWeek day=dt.getDayOfWeek();
        System.out.println(day);
        Month month=dt.getMonth();
        System.out.println(month);

        int dayYear=dt.getDayOfYear();
        System.out.println("dayYear"+dayYear);
        System.out.println("-------");

        //with()
        System.out.println(dt);
        LocalDateTime dw1= dt.with(Month.JANUARY).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(dw1);

        LocalTime localTime=LocalTime.of(10,00);
        LocalDate localDate=LocalDate.of(2000,8,12);
        LocalDateTime dw2=dt.with(localDate).with(localTime);
        System.out.println(dw2);
        LocalDateTime dw3=dt.withHour(5).withDayOfMonth(12);
        System.out.println(dw3);


    }
}
