package DateAndTime;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormaterClass {
    public static void main(String[] args) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d-MM-uuuu", Locale.FRANCE);
        LocalDate date=LocalDate.now();
        String newDate=date.format(formatter);
        System.out.println(newDate);
        DateTimeFormatter df1=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String s1=date.format(df1);
        System.out.println(s1);
        DateTimeFormatter df2=DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        LocalTime time =LocalTime.now();
        String t1=time.format(df2);
        System.out.println(t1);
        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df3=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String s3=dt.format(df3);
        System.out.println(s3);
        DateTimeFormatter df4=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM);
        String s4=dt.format(df4);
        System.out.println(s4);
        Format format=formatter.toFormat();
        System.out.println(format);

        LocalDate dtt=LocalDate.parse("1-12-2024",formatter);
        System.out.println(dtt);

    }
}
