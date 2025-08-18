package s06.pt2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite as repetições: ");
        int n = sc.nextInt();
        int num, in = 0, out = 0;

        for(int i=0; i<n; i++){
            System.out.print("Digite um valor: ");
            num = sc.nextInt();
            if(num >= 10 && num <= 20){
                in += 1;
            }else{
                out += 1;
            }
        }
        System.out.println("In: " + in);
        System.out.println("Out: " + out);

        sc.close();
    }
}
