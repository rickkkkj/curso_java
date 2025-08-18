package s10.exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class arrayNegativos {
    public static void main(String[] args) {
        //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        //e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = 0;

        do {
            if(N > 10 || N < 0){
                System.out.print("Maximo atigindo, digite um valor entre 0 à 10: ");
            }else{
                System.out.print("Digite a quantidade de numeros: ");
            }
            N = sc.nextInt();
        }while(N > 10 || N < 0);
        int[] vect = new int[N];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Esse são os números pares: ");
        for(int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
