package s08.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueinStock(){
        return price * quantity;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " unity, Total: $ " + String.format("%.2f", TotalValueinStock());
    }

}
