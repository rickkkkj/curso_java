package s10.exercicios.ex001;

import s10.exercicios.ex001.entities.Aprovados;

import java.util.Locale;
import java.util.Scanner;

public class arrayAprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        Aprovados[] vect = new Aprovados[n];
        String nome;
        double nota1;
        double nota2;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
            sc.nextLine();
            nome = sc.nextLine();
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            vect[i] = new Aprovados(nome, nota1, nota2);
        }
        System.out.println("Aprovados: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].Media(vect[i].getNota1(), vect[i].getNota2()) >= 6){
                System.out.print(vect[i].getNome());
                System.out.println();
            }
        }


        sc.close();
    }
}
