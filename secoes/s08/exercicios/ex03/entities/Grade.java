package s08.exercicios.ex03.entities;

public class Grade {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    double pass;

    public double FinalGrade() {
        return nota1 + nota2 + nota3;
    }

    public double Pass() {
        double finalGrade = FinalGrade();
        if (finalGrade >= 60) {
            return 0.0;
        } else {
            return 60.0 - finalGrade;
        }
    }

}
