package s06.pt2;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um n: ");
        int num = sc.nextInt();
        int resto = 0;

            for(int i=0; i<num; i++){
                resto = i % 2;

                if(resto != 0){
                    System.out.println(i);
                }
            }
        sc.close();
    }
}
