package secao10.exercicios.ex001;

import secao10.exercicios.ex001.entities.DadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class arrayDadoPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        DadosPessoas[] vect = new DadosPessoas[n];
        double altura;
        String genero;
        double menor;
        double maior;
        double numeroH = 0;
        double mediaF = 0;
        double mediaDiv = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Altura do " + (i+1) + "a pessoa: ");
            altura = sc.nextDouble();
            System.out.print("Genero do " + (i+1) + "a pessoa(M/F): ");
            sc.nextLine();
            genero = sc.nextLine();

            vect[i] = new DadosPessoas(genero, altura);
        }

        maior = menor = vect[0].getAltura();
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAltura() > maior){
                maior = vect[i].getAltura();
            }
            if(vect[i].getAltura() < menor){
                menor = vect[i].getAltura();
            }
            if(vect[i].getGenero().equalsIgnoreCase("F")){
                mediaF += vect[i].getAltura();
                mediaDiv += 1;
            }
            if(vect[i].getGenero().equalsIgnoreCase("M")){
                numeroH += 1;
            }
        }
        if (mediaDiv > 0) {
            mediaF = mediaF / mediaDiv;
        } else {
            mediaF = 0;
        }
        System.out.println("Menor altura: " + menor);
        System.out.println("Maior altura: " + maior);
        System.out.println("Media da alturas das mulheres: " + mediaF);
        System.out.println("Quantidade de homens: " + numeroH);




        sc.close();
    }
}
