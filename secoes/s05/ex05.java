package s05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd, qnt;
        System.out.print("Digite o codigo: ");
        do {
            cd = sc.nextInt();
            if(cd == 1){
                System.out.print("Digite a quantidade: ");
                qnt = sc.nextInt();
                System.out.println("O valor é: " + qnt * 4);
            }else if(cd == 2){
                System.out.print("Digite a quantidade: ");
                qnt = sc.nextInt();
                System.out.println("O valor é: " + qnt * 4.5);
            }else if(cd == 3){
                System.out.print("Digite a quantidade: ");
                qnt = sc.nextInt();
                System.out.println("O valor é: " + qnt * 5);
            }else if(cd == 4){
                System.out.print("Digite a quantidade: ");
                qnt = sc.nextInt();
                System.out.println("O valor é: " + qnt * 2);
            }else if(cd == 5){
                System.out.print("Digite a quantidade: ");
                qnt = sc.nextInt();
                System.out.println("O valor é: " + qnt * 1.5);
            }else{
                System.out.println("Codigo invalido!");
            }
        }while(cd < 1 || cd > 5);
        sc.close();
    }
}
