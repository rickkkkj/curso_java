package s07;

import java.util.Scanner;

public class funcoesSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int n;

        for (int i = 0; i < 3; i++){
            n = sc.nextInt();
            if (n > maior){
                maior = n;
            }
        }

        System.out.println(maior);
        sc.close();
    }
}
