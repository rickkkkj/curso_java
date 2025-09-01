package s12.aulas.exercicios.entities;

public class OrderItem {
    private Integer quantidade;
    private Double preco;
    private Product product; // apenas 1 produto por item

    public OrderItem(){}

    public OrderItem(Integer quantidade, Double preco, Product product){
        this.quantidade = quantidade;
        this.preco = preco;
        this.product = product;
    }

    public Double subTotal(){
        return quantidade * preco;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getNome() +
                ", $" +
                product.getPreco() +
                ", Quantity: " +
                quantidade +
                ", Subtotal: " +
                subTotal()
        );
        return sb.toString();
    }
}
