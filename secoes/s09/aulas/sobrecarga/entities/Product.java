package s09.aulas.sobrecarga.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //podemos ter construtores com diferentes assinaturas
    //sobrecarga de construtores
    //construtor vazio
    //construtor com 2 parametros
    //construtor com 3 parametros
    //tudo depende da quantidade de parametros que passamos
    //e da ordem dos tipos de parametros

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}