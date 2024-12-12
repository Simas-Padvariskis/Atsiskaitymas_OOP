import java.util.LinkedList;

public class Customer {
    private String name;
    private String email;
    private LinkedList<Order> orderHistory;

    Customer (String name, String email){
        this.name=name;
        this.email=email;
        this.orderHistory = new LinkedList<>();
    }

    public void placeOrder (Order order){
        orderHistory.add(order);
    }

    public void getOrderStatistics (){
        System.out.println(orderHistory);
    }
}
