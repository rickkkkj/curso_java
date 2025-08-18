package s06.pt2;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um n: ");
        int num = sc.nextInt();
        double n1, n2, n3, media;

        for(int i = 0; i < num ; i++){
            System.out.print("Digite um n: ");
            n1 = sc.nextDouble();
            System.out.print("Digite um n: ");
            n2 = sc.nextDouble();
            System.out.print("Digite um n: ");
            n3 = sc.nextDouble();
            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 3;
            System.out.printf("A media e: %.2f%n", media);
        }
    }
}
