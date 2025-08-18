package s04;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cd1, cd2, qnt1, qnt2;
        double v1, v2, total;

        System.out.print("Codigo 01: ");
        cd1 = sc.nextInt();
        System.out.print("Quantidade 01: ");
        qnt1 = sc.nextInt();
        System.out.print("Valor 01: ");
        v1 = sc.nextDouble();
        System.out.print("Codigo 02: ");
        cd2 = sc.nextInt();
        System.out.print("Quantidade 02: ");
        qnt2 = sc.nextInt   ();
        System.out.print("Valor 02: ");
        v2 = sc.nextDouble();

        total = qnt1 * v1 + qnt2 * v2;
        System.out.printf("Total %.2f", total);
        sc.close();
    }
}
