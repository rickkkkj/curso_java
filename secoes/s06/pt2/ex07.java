package s06.pt2;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(double i = 1; i <= n; i++){
            double q, c;
            q = Math.pow(i, 2);
            c = Math.pow(i, 3);

            System.out.printf("%.2f, %.2f, %.2f%n", i, q, c);
        }

        sc.close();
    }
}
