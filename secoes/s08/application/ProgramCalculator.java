package s08.application;

import s08.util.Calculator;
import s08.util.CalculatorDois;
import java.util.Locale;
import java.util.Scanner;

public class ProgramCalculator {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de raio: ");
        double raio = sc.nextDouble();
        double c = CalculatorDois.circunferencia(raio);
        double v = CalculatorDois.volume(raio);

        System.out.println("Circuferência: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("Valor de PI: " + String.format("%.2f", CalculatorDois.PI));

        sc.close();
    }
}
