package s08.exercicios.ex02.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    private double percentage;

    public double NetSalary(){
        return grossSalary - tax;
    }
    public void IncreaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100.0);
    }

}
