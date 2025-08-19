package secao10.exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class arraySoma_vetor {
    public static void main(String[] args) {
        //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        //- Imprimir todos os elementos do vetor
        //- Mostrar na tela a soma e a média dos elementos do vetor
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double mediaSoma = 0.0;

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            mediaSoma += vect[i];
        }

        System.out.print("Valores: ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.2f ", vect[i]);
        }

        System.out.println();
        System.out.println("Soma é: " + mediaSoma);
        System.out.println("Media é: " + mediaSoma/n);

        sc.close();
    }
}
