package s10.aulas.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetoresTipoPrimitivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number people: ");
        int N = sc.nextInt();
        double[] vect = new double[N];
        double media = 0.0;

        for(int i = 0; i < N; i++) {
            System.out.print("Enter height: ");
            vect[i] = sc.nextDouble();
            media += vect[i];
        }
        sc.nextInt();
        System.out.printf("Average height: %.2f%n", (media/N));

        sc.close();
    }
}
