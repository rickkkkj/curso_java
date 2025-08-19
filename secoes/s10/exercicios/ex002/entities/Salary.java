package s10.exercicios.ex002.entities;

public class Salary {
    private Integer id;
    private String name;
    private Double salary;

    // constructor

    public Salary(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getters e setters

    public String getName(){
        return name;
    }
    public Integer getId(){
        return id;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double increase){
        this.salary = increase;
    }

    public void increaseSalary(Double percentage){
        salary = salary + (salary * percentage/100);
    }

    public String toString(){
        return getId() + ", " + getName() + ", " + String.format(" %.2f", getSalary());
    }
}
