package s12.aulas.composicao.application;

import s12.aulas.composicao.entities.Department;
import s12.aulas.composicao.entities.HourContract;
import s12.aulas.composicao.entities.Worker;
import s12.aulas.composicao.entities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome com o departamento: ");
        String departamento = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salarial: ");
        double baseSalarial = sc.nextDouble();

        Worker worker = new Worker(nome, WorkerLevel.valueOf(level.toUpperCase()), baseSalarial, new Department(departamento));

        System.out.print("Quantos contratos ele vai ter: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com o dado do #" + i + " Contrato: ");
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine(); // limpar o buffer
            Date contratcDate = sdf.parse(sc.nextLine());
            System.out.print("Valor por hora: ");
            Double valorPorHora = sc.nextDouble();
            System.out.print("Horas: ");
            Integer horas = sc.nextInt();
            System.out.println();

            HourContract contract = new HourContract(contratcDate, valorPorHora, horas);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Entre com o mes e ano que você quer verificar (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getNome());
        System.out.println("Departamento: " + worker.getDepartment().getNome());
        System.out.println("Recebido " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
