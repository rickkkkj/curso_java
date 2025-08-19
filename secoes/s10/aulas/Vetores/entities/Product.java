package secao10.aulas.Vetores.entities;

public class Product {
    // atributos
    private String name;
    private double price;

    // contrutor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //get e set
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
