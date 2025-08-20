package s11.aulas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class InstanciandoDatas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2025-06-21");
        LocalDateTime d05 = LocalDateTime.parse("2025-06-21T12:00:00.1");
        Instant d06 = Instant.parse("2025-06-21T20:00:00.1Z");
        Instant d07 = Instant.parse("2025-06-21T20:00:00.1-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt01);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt02);
        LocalDate d10 = LocalDate.of(2022, 07, 22);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 22, 1, 30);


        System.out.println("D01: " + d01);
        System.out.println("D02: " + d02);
        System.out.println("D03: " + d03);
        System.out.println("D04: " + d04);
        System.out.println("D05: " + d05);
        System.out.println("D06: " + d06);
        System.out.println("D07: " + d07);
        System.out.println("D08: " + d08);
        System.out.println("D09: " + d09);
        System.out.println("D10: " + d10);
        System.out.println("D11: " + d11);




        sc.close();
    }
}
