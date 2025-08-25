package s12.aulas.composicao.entities;

import java.util.Date;

public class HourContract {
    private Date data;
    private Double valorPorHora;
    private Integer hora;

    public HourContract(){
    }
    public HourContract(Date data, Double valorPorHora, Integer hora){
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public void setData(Date data){
        this.data = data;
    }
    public void setValorPorHora(Double valorPorHora){
        this.valorPorHora = valorPorHora;
    }
    public void setHora(Integer hora){
        this.hora = hora;
    }
    public Date getData(){
        return data;
    }
    public Double getValorPorHora(){
        return valorPorHora;
    }
    public Integer getHora(){
        return hora;
    }

    public Double totalValor(){
        return valorPorHora * hora;
    }

}
