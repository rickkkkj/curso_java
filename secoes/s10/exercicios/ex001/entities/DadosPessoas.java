package s10.exercicios.ex001.entities;

public class DadosPessoas {
    private String genero;
    private double altura;

    public DadosPessoas(String genero, double altura){
        this.genero = genero;
        this.altura = altura;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setAltura(double altura){
        this.altura  = altura;
    }
    public String getGenero(){
        return genero;
    }
    public double getAltura(){
        return altura;
    }



}
