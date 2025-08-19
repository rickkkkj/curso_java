package secao10.exercicios.ex001;

import java.util.Locale;
import java.util.Scanner;

public class arraySomaVetores {
    public static void main(String[] args) {
        //Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        //terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        //o vetor C gerado.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros os vetores terao: ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];


        for (int i = 0; i < vectA.length; i++) {
            System.out.print("Digite o valor do " + (i+1) + "numero do vetor: ");
            vectA[i] = sc.nextInt();
        }
        System.out.println("\nValores do Segundo Vetor: ");
        for (int i = 0; i < vectB.length; i++) {
            System.out.print("Digite o valor do " + (i+1) + "numero do vetor: ");
            vectB[i] = sc.nextInt();
        }
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }
        System.out.println("\nVetores resultantes: ");
        for (int i = 0; i < vectC.length; i++) {
            System.out.println(vectC[i]);
        }


        sc.close();
    }
}
