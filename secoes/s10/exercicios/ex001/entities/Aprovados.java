package secao10.exercicios.ex001.entities;

public class Aprovados {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public Aprovados(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public String getNome(){
        return nome;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }

    public double Media(double nota1, double nota2){
        return media = (nota1 + nota2) / 2;
    }
}
