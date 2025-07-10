package DateAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class InstantClass {
    public static void main(String[] args) {
        Instant instant=Instant.now();
        System.out.println(instant);
        Date date=new Date();
        System.out.println(date);
        LocalDateTime ld=LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("Asia/Calcutta"));
        System.out.println(ld);
        Calendar calendar=Calendar.getInstance();

        System.out.println(calendar);
        LocalDateTime ld2=LocalDateTime.ofInstant(calendar.toInstant(),ZoneId.of("Asia/Calcutta"));
        System.out.println(ld2);
    }
}
