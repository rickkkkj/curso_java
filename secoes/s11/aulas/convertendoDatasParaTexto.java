package s11.aulas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class convertendoDatasParaTexto {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-09-21");
        LocalDateTime d02 = LocalDateTime.parse("2022-09-21T01:30:21");
        Instant d03 = Instant.parse("2022-09-21T01:30:21Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //zoneid.systemdefault pega o fuso do meu
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("D01: " + d01.format(fmt01)); //uma formas
        System.out.println("D01: " + fmt01.format(d01)); //outra formas
        System.out.println("D01: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //outra formas

        System.out.println();
        System.out.println("D02: " + d02.format(fmt01));
        System.out.println("D02: " + d02.format(fmt02));

        System.out.println();
        System.out.println("D03: " + fmt03.format(d03));





    }
}
