package s06.pt2;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;

        for(int i = 1; i < n; i++){
            if (n % i == 0){
                System.out.println("------------------");
                num = n / i;
                System.out.println(num);
            }
        }

        sc.close();
    }
}
