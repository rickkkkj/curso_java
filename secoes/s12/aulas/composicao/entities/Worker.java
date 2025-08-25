package s12.aulas.composicao.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String nome;
    private WorkerLevel level;
    private Double baseSalarial;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){
    }
    public Worker(String nome, WorkerLevel level, Double baseSalarial, Department department){
        this.nome = nome;
        this.level = level;
        this.baseSalarial = baseSalarial;
        this.department = department;
    }
    //get e set
    public Double getBaseSalarial() {
        return baseSalarial;
    }
    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }
    public List<HourContract> getContracts() {
        return contracts;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos

    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts){
            cal.setTime(c.getData());
            int c_month = 1 + cal.get(Calendar.MONTH);
            int c_year = cal.get(Calendar.YEAR);
            if (c_year == year && c_month == month){
                soma += c.totalValor();
            }
        }
        return soma;
    }
}

