package DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class PeriodClassDemo {
    public static void main(String[] args) {
        Period p=Period.of(1,1,1);
        System.out.println(p);
        Period p1=Period.ofDays(1);
        System.out.println(p1);
        Period p2=Period.ofMonths(1);
        System.out.println(p2);
        Period p3=Period.ofYears(1);
        System.out.println(p3);
        Period p4=Period.ofWeeks(1);
        System.out.println(p4);

        Period p5=Period.parse("P1Y1M1D");
        System.out.println(p5);

        Period p6=Period.of(0,0,0);
        System.out.println(p6);
        boolean val=p6.isZero();
        System.out.println(val);

        Period p7=Period.of(0,-1,7);
        System.out.println(p7);
        boolean val2=p7.isNegative();
        System.out.println(val2);

        int day=p7.getDays();
        System.out.println(day);
        int month=p7.getMonths();
        System.out.println(month);
        int year=p7.getYears();
        System.out.println(year);
        List<TemporalUnit> list= p1.getUnits();
        System.out.println(list);
        IsoChronology is=p7.getChronology();
        System.out.println(is);

        LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.of(2023,1,1);
        Period p8=Period.between(d1,d2);
        System.out.println(p8);

        System.out.println("---------------");

        long l=p8.toTotalMonths();
        System.out.println(l);
        System.out.println("*******");

        Period p9=p.withDays(2);
        System.out.println(p9);
        Period p10=p.withMonths(2);
        System.out.println(p10);
        Period p11=p.withYears(2);
        System.out.println(p11);

        Period p12=p.plusDays(2);
        System.out.println(p12);
        Period p13=p.plusMonths(2);
        System.out.println(p13);
        Period p14=p.plusYears(2);
        System.out.println(p14);
        Period p15=p.minusDays(2);
        System.out.println(p15);
        Period p16=p.minusMonths(2);
        System.out.println(p16);
        Period p17=p.minusYears(2);
        System.out.println(p17);

        long xx=p17.get(ChronoUnit.YEARS);
        System.out.println(xx);

        Period p18=p.multipliedBy(5);
        System.out.println(p18);

        Period p19=p.negated();
        System.out.println(p19);

        LocalDate date =LocalDate.now();
        LocalDate date2=date.plus(Period.of(1,3,5));
        long diff=ChronoUnit.YEARS.between(date,date2);
        System.out.println(diff);






    }
}
