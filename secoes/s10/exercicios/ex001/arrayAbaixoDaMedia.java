package secao10.exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class arrayAbaixoDaMedia {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        //mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        //os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double media = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            media += vect[i];
        }
        media = media/n;
        System.out.println("Media do vetor: " + media);
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
