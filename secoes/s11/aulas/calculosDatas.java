package s11.aulas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculosDatas {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-09-21");
        LocalDateTime d02 = LocalDateTime.parse("2022-09-21T01:30:21.23");
        // Instant d03 = Instant.parse("2022-09-20T01:30:21Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
        // Instant days = d03.minus(7, ChronoUnit.DAYS);

        System.out.println("PASTE: " + pastWeekLocalDate);
        System.out.println("ATUAL: " + d01);
        System.out.println("NEXT: " + nextWeekLocalDate);

        Duration t1 = Duration.between(nextWeekLocalDateTime, d02);
        //Duration t2 = Duration.between(nextWeekLocalDate.atTime(0,0), d01.atTime(0, 0));
        Duration t2 = Duration.between(nextWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t3 = Duration.between(d01.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());

    }

}
