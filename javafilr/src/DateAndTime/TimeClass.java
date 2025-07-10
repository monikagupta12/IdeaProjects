package DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.LocalTime.*;

public class TimeClass {
    public static void main(String[] args) {
        System.out.println("MAX Time: "+MAX);
        System.out.println("MIN Time: "+MIN);
        System.out.println("NOON Time: "+NOON);
        System.out.println("MID NIGHT Time: "+MIDNIGHT);
        System.out.println("--------");

        LocalTime t1= now();
        System.out.println("System Time: "+t1);
        Clock clock=Clock.systemDefaultZone();
        LocalTime t2= now(clock);
        System.out.println("Current time: "+t2);
        ZoneId zoneId=ZoneId.of("Asia/Calcutta");
        LocalTime t3= now(zoneId);
        System.out.println("Asai/Calcutta Zone Time: "+t3);
        System.out.println("--------");

        LocalTime t4= of(11,38);
        System.out.println(t4);
        LocalTime t5= of(11,38,59);
        System.out.println(t5);
        LocalTime t6= of(11,38,59,9999999);
        System.out.println(t6);
        System.out.println("--------");
        LocalTime tt= LocalTime.ofNanoOfDay(4000);
        System.out.println(tt);
        LocalTime ttt= LocalTime.ofSecondOfDay(15);
        System.out.println(ttt);
        System.out.println("--------");

        LocalTime t7= parse("12:12:12");
        System.out.println(t7);
        System.out.println("--------");

        LocalTime t8=t1.plus(2000, ChronoUnit.NANOS);
        System.out.println(t1+" add 2000 nanoSecond "+t8);
        System.out.println("--------");

        LocalTime t9=t1.plusHours(2);
        System.out.println(t1+" add 2 hours "+t9);
        LocalTime t10=t1.plusMinutes(10);
        System.out.println(t1+" add 10 min "+t10);
        LocalTime t11=t1.plusSeconds(30);
        System.out.println(t1+" add 30 sec "+t11);
        LocalTime t12=t1.plusNanos(4000);
        System.out.println(t1+" add 4000 nanoSec "+t12);
        System.out.println("--------");

       LocalTime t13=t1.minus(50,ChronoUnit.SECONDS);
        System.out.println(t1+" minus 50 sec "+t13);
        System.out.println("--------");

        LocalTime t14=t1.minusHours(2);
        System.out.println(t1+" minus 2 hours "+t14);
        LocalTime t15=t1.minusMinutes(10);
        System.out.println(t1+" minus 10 min "+t15);
        LocalTime t16=t1.minusSeconds(30);
        System.out.println(t1+" minus 30 sec "+t16);
        LocalTime t17=t1.minusNanos(4000);
        System.out.println(t1+" minus 4000 nanoSec "+t17);
        System.out.println("--------");

        LocalTime t18=t1.withHour(2);
        System.out.println(t18);
        LocalTime t19=t1.withMinute(10);
        System.out.println(t19);
        LocalTime t20=t1.withSecond(30);
        System.out.println(t20);
        LocalTime t21=t1.withNano(4000);
        System.out.println(t21);
        System.out.println("--------");

        boolean val1=t8.isAfter(t1);
        System.out.println(val1);
        boolean val2=t13.isBefore(t1);
        System.out.println(val2);
        System.out.println("--------");

        System.out.println(t1);
        int hours=t1.getHour();
        System.out.println(hours);
        int min=t1.getMinute();
        System.out.println(min);
        int sec=t1.getSecond();
        System.out.println(sec);
        long nenoSec=t1.getNano();
        System.out.println(nenoSec);
        System.out.println("--------");
        int tx=t1.toSecondOfDay();
        System.out.println(tx);
        long ts=t1.toNanoOfDay();
        System.out.println(ts);









    }
}
