package s07;

import java.util.Scanner;

public class operadorBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mask = 0b100000; // declarar numero binario "0b" e a frente coloca o binario
        int n = sc.nextInt();

        if((n & mask) != 0){
            System.out.println("V");
        } else{
            System.out.println("F");
        }


        sc.close();
    }
}
