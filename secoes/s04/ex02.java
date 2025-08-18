package s04;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        double raio, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Me fale o raio: ");
        raio = sc.nextDouble();
        resultado = 3.14159 * Math.pow(raio, 2);

        System.out.printf("O resultado é : %.4f", resultado);



    }
}
