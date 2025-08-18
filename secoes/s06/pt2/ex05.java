package s06.pt2;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;

        for(int i = 0; i < n; i++){
            if (n == 0) {
                System.out.println("Fatorial de 0 é 1!");
            } else{
                res *= n-i;
            }
        }

        System.out.println(res);
        sc.close();
    }
}
