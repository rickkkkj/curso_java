package s04;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double h, v, resultado;

        System.out.print("Qual seu número: ");
        n = sc.nextInt();
        System.out.print("Digite suas horas trabalhadas: ");
        h = sc.nextDouble();
        System.out.print("Digite o valor da sua hora: ");
        v = sc.nextDouble();

        resultado = h * v;

        System.out.println("Número: " + n);
        System.out.println("Resultado U$: " + resultado);

    }
}
