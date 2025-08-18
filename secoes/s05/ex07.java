package s05;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.print("Me de um valor X: ");
        x = sc.nextDouble();
        System.out.print("Me de um valor Y: ");
        y = sc.nextDouble();

        if(x == 0 && y ==0){
            System.out.println("Ele está na origem");
        }else if(x == 0){
            System.out.println("Eixo Y");
        }else if(y == 0){
            System.out.println("Eixo X");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else {
            System.out.println("Q4");
        }
        sc.close();
    }
}
