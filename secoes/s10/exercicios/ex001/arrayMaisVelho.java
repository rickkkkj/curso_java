package secao10.exercicios.ex001;

import secao10.exercicios.ex001.entities.MaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class arrayMaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();
        MaisVelho[] pessoa = new MaisVelho[n];
        String nome;
        int idade;

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();

            pessoa[i] = new MaisVelho(nome, idade);
        }
        nome = "";
        idade = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() > idade){
                idade = pessoa[i].getIdade();
                nome = pessoa[i].getNome();
            }
        }
        System.out.println("Pessoa mais velha: " + nome);



        sc.close();
    }
}
