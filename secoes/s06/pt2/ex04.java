package s06.pt2;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas vezes: ");
        int n = sc.nextInt();
        System.out.println("----------------------");
        int div, den, res;

        for (int i = 0; i < n; i++){
            System.out.print("Digite o div: ");
            div = sc.nextInt();
            System.out.println("----------------------");
            System.out.print("Digite o dev: ");
            den = sc.nextInt();
            System.out.println("----------------------");

            if(den == 0){
                System.out.println("Impossivel realizar");
                System.out.println("----------------------");
            }else{
                res = div/den;
                System.out.print("Essa divisão da: " + res);
                System.out.println("----------------------");
            }
        }

        sc.close();
    }
}
