package s04;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, resultado;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();
        System.out.print("Digite o quarto número: ");
        d = sc.nextInt();

        resultado = (a*b) - (c*d);
        System.out.println("A diferença é: " + resultado);

    }
}
