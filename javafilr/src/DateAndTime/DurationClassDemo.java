package DateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class DurationClassDemo {
    public static void main(String[] args) {
        System.out.println(Duration.ZERO);
        Duration d=Duration.of(1, ChronoUnit.HOURS);
        System.out.println(d);
        Duration d1=Duration.ofDays(2);
        System.out.println(d1);
        Duration d2=Duration.ofHours(2);
        System.out.println(d2);
        Duration d3=Duration.ofMinutes(2);
        System.out.println(d3);
        Duration d4=Duration.ofSeconds(30);
        System.out.println(d4);
        Duration d5=Duration.ofMillis(300);
        System.out.println(d5);
        Duration d6=Duration.ofNanos(1000);
        System.out.println(d6);
        Duration d7=Duration.ofSeconds(30,1000);
        System.out.println(d7);


        System.out.println("------");
        Duration d8=Duration.parse("P2DT3H4M");
        System.out.println(d8);

        System.out.println("------");
        LocalTime t1=LocalTime.of(11,3,50,1000);
        LocalTime t2=LocalTime.of(2,35);
        Duration d9=Duration.between(t1,t2);
        System.out.println(d9);

        System.out.println("--------");
        long nanos= d9.get(ChronoUnit.SECONDS);
        System.out.println(nanos);
        List<TemporalUnit> list=d1.getUnits();
        System.out.println(list);
        System.out.println("------");
        System.out.println(d8);

        System.out.println(d9);
        int nano=d9.getNano();
        System.out.println(nano);
        long second=d9.getSeconds();
        System.out.println(second);

        System.out.println("-----------");

        long days=d8.toDays();
        System.out.println(days);
        long dayPart=d8.toDaysPart();
        System.out.println(dayPart);
        long hour=d8.toHours();
        System.out.println(hour);
        long hoursPart=d8.toHoursPart();
        System.out.println(hoursPart);
        long mint=d8.toMinutes();
        System.out.println(mint);
        int mintPart=d8.toMinutesPart();
        System.out.println(mintPart);
        long sec=d9.toSeconds();
        System.out.println(sec);
        int secPart=d9.toSecondsPart();
        System.out.println(secPart);
        long milliSec=d9.toMillis();
        System.out.println(milliSec);
        int milliSecPart=d9.toMillisPart();
        System.out.println(milliSecPart);
        long nanoSec=d9.toNanos();
        System.out.println(nanoSec);
        int nanoSecPart=d9.toNanosPart();
        System.out.println(nanoSecPart);
        System.out.println("-------");
        //
        System.out.println(d1);
        Duration d11= d1.withNanos(4000000);
        System.out.println(d11);
        Duration d12= d.withSeconds(60);
        System.out.println(d12);
        System.out.println("-------");
        //
        Duration d0=Duration.ZERO;
        boolean val=d0.isZero();
        System.out.println(val);
        boolean val1= d.isNegative();
        System.out.println(val1);
        boolean val2=d.isPositive();
        System.out.println(val2);
        System.out.println("----");

        //
        System.out.println(d);
        Duration dp1=d.plus(Duration.parse("PT48H"));
        System.out.println(dp1);
        Duration dp2=d.plusDays(1);
        System.out.println(dp2);
        Duration dp3=d.plusHours(5);
        System.out.println(dp3);
        Duration dp4=d.plusMinutes(30);
        System.out.println(dp4);
        Duration dp5=d.plusSeconds(30);
        System.out.println(dp5);
        Duration dp6=d.plusMillis(1000);
        System.out.println(dp6);
        Duration dp7=d.plusNanos(40000000);
        System.out.println(dp7);
        System.out.println("----------");
        //
        System.out.println(dp4);
        Duration dn=dp4.negated();
        System.out.println(dn);
        System.out.println("------");

        //
        Duration dm=dp4.multipliedBy(3);
        System.out.println(dm);
        Duration dm1=dm.truncatedTo(ChronoUnit.HOURS);
        System.out.println(dm1);
        Duration dv=dm.dividedBy(3);
        System.out.println(dv);
        //
        LocalTime time=LocalTime.now();
        LocalTime diff=time.plus(Duration.ofDays(2));
        long daydiff= ChronoUnit.HOURS.between(time,diff);
        System.out.println(daydiff);


    }
}
