package secao10.exercicios.ex002.matriz;

import java.util.Locale;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("Num: ");
        int num = sc.nextInt();
        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == num){
                    System.out.println("Posição: " + i + "," + j);
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if (i < m - 1) {
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (j < n - 1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                }
            }
        }



        sc.close();
    }
}
