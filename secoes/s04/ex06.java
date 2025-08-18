package s04;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, trapezio, circulo, quadrado, retangulo;

        System.out.print("Digite A:");
        a = sc.nextDouble();
        System.out.print("Digite B:");
        b = sc.nextDouble();
        System.out.print("Digite C:");
        c = sc.nextDouble();

        triangulo = a * c / 2.0;
        trapezio = (a + b) / 2.0 * c;
        circulo = 3.14159 * Math.pow(c, 2);
        quadrado = b * b;
        retangulo = a * b;

        System.out.println("Triangulo: " + triangulo);
        System.out.println("Trapezio: " + trapezio);
        System.out.println("Circulo: " + circulo);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Retangulo: " + retangulo);

    }
}
