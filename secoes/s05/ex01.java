package s05;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num < 0){
            System.out.println("Este número é negativo!");
        } else if (num == 0){
            System.out.println("Este número é o zero!");
        } else{
            System.out.println("Este número é positivo!");
        }

        sc.close();
    }
}
