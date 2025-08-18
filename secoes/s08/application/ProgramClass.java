package s08.application;

import s08.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class ProgramClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Digite o valor de raio: ");
        double raio = sc.nextDouble();
        double c = calc.circunferencia(raio);
        double v = calc.volume(raio);

        System.out.println("Circuferência: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("Valor de PI: " + String.format("%.2f", calc.PI));

        sc.close();
    }
}
