package s11.aulas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class convertendoDatasGlobalParaLocal {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-09-21");
        LocalDateTime d02 = LocalDateTime.parse("2022-09-21T01:30:21.23");
        Instant d03 = Instant.parse("2022-09-20T01:30:21Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("D01 = " + d01.getDayOfMonth());
        System.out.println("D01 = " + d01.getMonthValue()); // getMonthValue = numeros | getMonth = escrita
        System.out.println("D01 = " + d01.getYear());

        System.out.println("D02 = " + d02.getHour());
        System.out.println("D02 = " + d02.getMinute());
        System.out.println("D02 = " + d02.getSecond());
        System.out.println("D02 = " + d02.getNano());



    }
}
