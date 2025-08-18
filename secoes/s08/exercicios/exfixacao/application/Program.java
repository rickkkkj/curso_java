package s08.exercicios.exfixacao.application;

import s08.exercicios.exfixacao.util.Dollar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dollar price: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        double amountInReais = Dollar.dollarToReal(dollarPrice, quantity);
        System.out.println("Amount to be paid in reais = " + String.format("%.2f%n", amountInReais));

        sc.close();
    }
}
