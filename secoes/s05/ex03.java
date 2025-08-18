package s05;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Digite um número: ");
        a = sc.nextInt();
        System.out.print("Digite outro número: ");
        b = sc.nextInt();

        if(a % b == 0){
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
