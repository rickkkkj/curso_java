package s10.exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class arrayNumerosPares {
    public static void main(String[] args) {
        //Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        //tela todos os números pares, e também a quantidade de números pares.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int paresQnt = 0;

        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Números Pares: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                paresQnt += 1;
            }
        }
        System.out.println();
        System.out.print("Quantidade de pares: " + paresQnt);




        sc.close();
    }
}
