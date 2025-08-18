package s06;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaC = 2002;
        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != senhaC){
            System.out.println("Senha invalida!");
            System.out.print("Digite a senha novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
