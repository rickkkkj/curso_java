package s12.aulas.composicao.entities;

public class Department {
    private String nome;

    public Department(){
    }
    public Department(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
