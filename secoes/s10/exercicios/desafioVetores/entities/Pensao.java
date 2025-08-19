package secao10.exercicios.desafioVetores.entities;

public class Pensao {
    private String nome;
    private String email;
    private int idQuarto;

    //construtor
    public Pensao(String nome, String email, int idQuarto){
        this.nome = nome;
        this.email = email;
        this.idQuarto = idQuarto;
    }

    // get e set
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public int getIdQuarto(){
        return idQuarto;
    }

    // tostring

    public String toString(){
        return "Id do quarto: " + getIdQuarto() +
                "\nNome: " + getNome() +
                "\nEmail: " + getEmail();
    }

}
