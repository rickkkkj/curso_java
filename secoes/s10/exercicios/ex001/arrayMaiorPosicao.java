package s10.exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class arrayMaiorPosicao {
    public static void main(String[] args) {
        //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        //o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        //considerando a primeira posição como 0 (zero).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double maiorValor = 0;
        int posicaoVect = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            if (vect[i] > maiorValor){
                maiorValor = vect[i];
                posicaoVect = i;
            }
        }
        System.out.print("Maior valor: " + maiorValor + "\n");
        System.out.print("Posicao do maior valor: " + posicaoVect);

        sc.close();
    }
}
