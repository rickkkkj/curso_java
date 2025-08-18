package s10.exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class arrayMediaPares {
    public static void main(String[] args) {
        //Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        //aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        //digitado, mostrar a mensagem "NENHUM NUMERO PAR
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double media = 0;
        double soma = 0;
        int div = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0){
                soma += vect[i];
                div += 1;
            }
        }
        media = soma/div;
        if(media > 0){
            System.out.printf("Media dos pares: %.1f%n", media);
        }else{
            System.out.println("Nenhum par foi lido.");
        }


        sc.close();
    }
}
