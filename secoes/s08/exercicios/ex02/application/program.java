package s08.exercicios.ex02.application;

import s08.exercicios.ex02.entities.Employee;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        double percentage;
        //entrada de dados
        System.out.print("Qual seu nome: ");
        employee.name = sc.nextLine();
        System.out.print("Qual seu salario bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Qual o imposto: ");
        employee.tax = sc.nextDouble();
        // imprimindo dados
        System.out.println("-----------------------");
        System.out.println("Name: " + employee.name);
        System.out.println("Gross Salary: " + String.format("%.2f", employee.grossSalary));
        System.out.println("Tax: " + String.format("%.2f", employee.tax));
        System.out.println("-----------------------");
        System.out.println("Employee: " + String.format("%.2f", employee.NetSalary()));
        System.out.println("-----------------------");
        // entrando dados novamente
        System.out.print("Percentage increase saalary: ");
        percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        // imprimindo dados
        System.out.println("-----------------------");
        System.out.println("Update data: " + employee.name +  ", $ " + String.format("%.2f", employee.NetSalary()));

        sc.close();
    }
}
