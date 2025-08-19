package secao10.exercicios.desafioVetores.application;

import secao10.exercicios.desafioVetores.entities.Pensao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 0;
        Pensao[] vect = new Pensao[10];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = new Pensao("", "", i);
        }

        int quartosLivres = 0;
        for (Pensao p : vect) {
            if (p.getNome().isEmpty()) {
                quartosLivres++;
            }
        }

        do {
            if (n > quartosLivres || n < 0){
                System.out.print("Valor inválido, digite novamente (máx " + quartosLivres + "): ");
            }else{
                System.out.print("Quantas pessoas vão alugar: (máx " + quartosLivres + ") ");
            }
            n = sc.nextInt();
        }while(n > quartosLivres || n < 0);

        for (int i = 0; i < n; i++) {
            int quartoEscolhido;
            do {
                System.out.print("Qual quarto ela deseja se registrar: (0 á 9) ");
                quartoEscolhido = sc.nextInt();
                sc.nextLine();
                if (!vect[quartoEscolhido].getNome().isEmpty()) {
                    System.out.println("Quarto já ocupado! Escolha outro.");
                }
            } while (!vect[quartoEscolhido].getNome().isEmpty());
            int idQuarto = quartoEscolhido;
            System.out.print("Qual o nome: ");
            String nome = sc.nextLine();
            System.out.print("Qual o email: ");
            String email = sc.nextLine();
            vect[idQuarto] = new Pensao(nome, email, idQuarto);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        System.out.println();

        for (Pensao p : vect) {
            if (!p.getNome().isEmpty()) {
                System.out.println(p);
                System.out.println();
            }
        }




        sc.close();
    }
}
