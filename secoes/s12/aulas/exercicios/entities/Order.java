package s12.aulas.exercicios.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date momento;
    private OrderStatus status;

    private List<OrderItem> orderItem = new ArrayList<>();

    public void addItem(OrderItem item){

    }
    public void removeItem(OrderItem item){

    }
    public Double total(){
        return 1.2;
    }
}
