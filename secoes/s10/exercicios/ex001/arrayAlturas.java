package secao10.exercicios.ex001;

import secao10.exercicios.ex001.entities.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class arrayAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();

        Alturas[] vect = new Alturas[n];
        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            System.out.println();

            vect[i] = new Alturas(nome, idade, altura);
        }

        altura = 0;
        for(int i = 0; i < vect.length; i++){
            altura += vect[i].getAltura();
        }
        System.out.printf("Altura média: %.2f%n", altura/vect.length);
        System.out.println();

        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
