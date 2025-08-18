package s05;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, ver;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        ver = num % 2;

        if(ver == 0){
            System.out.println("Este número é par!");
        }else{
            System.out.println("Este número é impar!");
        }
        sc.close();
    }
}
