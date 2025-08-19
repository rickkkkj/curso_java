package s10.exercicios.ex002.application;

import s10.exercicios.ex002.entities.Salary;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai cadastrar: ");
        int n = sc.nextInt();
        List<Salary> funcionario = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();
            funcionario.add(new Salary(id, name, salary));
            System.out.println();
        }

        System.out.print("Qual id vai receber o aumento: ");
        int id = sc.nextInt();

        Boolean encontrado = false;
        for(Salary fun : funcionario){
            if (fun.getId() == id){
                System.out.print("Quantos porcento vai ser o aumento: ");
                Double percentage = sc.nextDouble();
                fun.increaseSalary(percentage);
                encontrado = true;
                break;
            }
        }

        if(encontrado!=true){
            System.out.println("Id não foi encontrado!");
        }

        System.out.println("Lista de salarios: ");
        for (Salary fun : funcionario){
            System.out.println(fun);
        }
        sc.close();
    }
}
