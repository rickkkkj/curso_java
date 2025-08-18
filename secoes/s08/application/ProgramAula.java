package s08.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de raio: ");
        double raio = sc.nextDouble();
        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.println("Circuferência: " + String.format("%.2f", c));
        System.out.println("Volume: " + String.format("%.2f", v));
        System.out.println("Valor de PI: " + String.format("%.2f", PI));

        sc.close();
    }

    public static double circunferencia(double raio){
        return 2 * PI * raio;
    }
    public static double volume(double raio) {
        return 4.0 * PI * Math.pow(raio, 3) / 3.0;
    }
}
