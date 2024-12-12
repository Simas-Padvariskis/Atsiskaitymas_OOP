import java.util.LinkedList;

public class Order {
    private int orderId;
    private LinkedList<OrderItem> orderItems;

    Order (int orderId){
        this.orderId=orderId;
        this.orderItems = new LinkedList<>();
    }

    public void addProduct (Product product, int quantity){
        OrderItem newOrder = new OrderItem(product, quantity);
        orderItems.add(newOrder);
    }

    public double calculateTotal (){
        return orderItems.get(0).getSubtotal();
    }

    public void applyDiscount (){

    }
}
