package s08.exercicios.ex03.application;

import s08.exercicios.ex03.entities.Grade;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        double pass;

        System.out.print("Qual seu nome: ");
        grade.name = sc.nextLine();
        do{
            System.out.print("Digite a primeira nota: ");
            grade.nota1 = sc.nextDouble();
            if(grade.nota1 > 30){
                System.out.println("Nota invalida!");
                System.out.println("Digite novamente!");
            }
        }while (grade.nota1 > 30);
        do{
            System.out.print("Digite a segunda nota: ");
            grade.nota2 = sc.nextDouble();
            if(grade.nota2 > 35){
                System.out.println("Nota invalida!");
                System.out.println("Digite novamente!");
            }
        }while (grade.nota2 > 35);
        do{
            System.out.print("Digite a terceira nota: ");
            grade.nota3 = sc.nextDouble();
            if(grade.nota3 > 35){
                System.out.println("Nota invalida!");
                System.out.println("Digite novamente!");
            }
        }while (grade.nota3 > 30);

        System.out.println("Final Grade: " + grade.FinalGrade());

        pass = grade.Pass();

        if(pass == 0){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
            System.out.println("Missing " + String.format("%.2f", pass) + " points");
        }

        sc.close();
    }
}
