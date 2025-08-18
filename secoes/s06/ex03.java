package s06;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, alcool = 0, gasolina = 0, diesel = 0, rept = 0;

        System.out.print("Digite um número: ");
        do {
            if (rept == 1){
                System.out.print("Digite um número novamente: ");
            }
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    alcool += 1;
                    System.out.println("Alcool: " + alcool);
                    rept = 1;
                    break;
                case 2:
                    gasolina += 1;
                    System.out.println("Gasolina: " + gasolina);
                    rept = 1;
                    break;
                case 3:
                    diesel += 1;
                    System.out.println("Diesel: " + diesel);
                    rept = 1;
                    break;
                case 4:
                    System.out.println("Os consumos foram:");
                    System.out.println("Alcool: " + alcool);
                    System.out.println("Gasolina: " + gasolina);
                    System.out.println("Diesel: " + diesel);
                    System.out.println("Muito Obrigado!");
                    return;
                default:
                    System.out.print("Numero invalido, tente novamente: ");
                    opcao = sc.nextInt();
            }

        } while (opcao != 4);

        sc.close();
    }
}
