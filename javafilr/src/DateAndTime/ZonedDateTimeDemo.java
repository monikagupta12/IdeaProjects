package DateAndTime;

import org.w3c.dom.ranges.Range;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ValueRange;

import static java.time.temporal.ChronoField.EPOCH_DAY;
import static java.time.temporal.ChronoField.NANO_OF_SECOND;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        for(String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

        System.out.println("-------");
        ZonedDateTime z=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("US/Pacific"));
        System.out.println(z);
        LocalDateTime d=LocalDateTime.now(ZoneId.of("US/Pacific"));
        System.out.println(d);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        ZonedDateTime z1= ZonedDateTime.ofLocal(dt,ZoneId.of("US/Pacific"), ZoneOffset.of("+09:00"));
        System.out.println(z1);
        System.out.println("-----");
        ZoneOffset offset=z.getOffset();
        System.out.println(offset);
        ZoneId zoneId=z.getZone();
        System.out.println(zoneId);
        boolean val=z.isSupported(ChronoField.HOUR_OF_AMPM);
        System.out.println(val);
        long val2=z.getLong(ChronoField.MICRO_OF_DAY);
        System.out.println(val2);

        ValueRange valueRange=z.range(ChronoField.MICRO_OF_DAY);
        System.out.println(valueRange);
        System.out.println("----------");

        LocalDateTime dt2=z.toLocalDateTime();
        System.out.println(dt2);

        // offSETDateTime
        OffsetDateTime o1=OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+02:00"));
        System.out.println(o1);
        ZoneOffset zo=o1.getOffset();
        System.out.println(zo);

    }
}
