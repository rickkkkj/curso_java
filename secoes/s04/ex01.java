package s04;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, resultado;
        System.out.print("Digite o primeiro número:");
        x = sc.nextDouble();
        System.out.print("Digite o segundo número:");
        y = sc.nextDouble();
        resultado = x + y;

        System.out.println("O resultado é: " + resultado);

    }
}
