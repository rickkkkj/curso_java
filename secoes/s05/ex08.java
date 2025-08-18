package s05;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, imposto = 0.0;

        do {
            System.out.print("Digite seu salario: ");
            salario = sc.nextDouble();
            if(salario >= 0 && salario <= 2000){
                System.out.println("Isento!");
            }else if(salario > 2000 && salario <= 3000){
                imposto += (salario  - 2000) * 0.18;
                System.out.println("São 8%");
                System.out.println("Você tem que pagar R$:" + imposto);
            }else if(salario > 3000 && salario <= 4500){
                imposto = 1000 * 0.08;
                imposto += (salario - 3000.00) * 0.18;
                System.out.println("São 18%");
                System.out.println("Você tem que pagar R$:" + imposto);
            }else if(salario > 4500) {
                imposto += (1000.00) * 0.08;
                imposto += (1500.00) * 0.18;
                imposto += (salario - 4500.00) * 0.28;
                System.out.println("São 28%");
                System.out.println("Você tem que pagar R$:" + imposto);
            }else{
                System.out.println("Salario invalido");
            }
        }while(salario < 0);
        sc.close();
    }
}
