package secao10.exercicios.ex001.entities;

public class MaisVelho {
    private String nome;
    private int idade;

    // construtor
    public MaisVelho(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // get e set
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
}
