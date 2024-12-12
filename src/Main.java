public class Main {
    public static void main(String[] args) {

        Electronics computer1 = new Electronics("Computer", 523.99, "Electronics", 5, "2 year warranty");
        Clothing shirt1 = new Clothing("Shirt", 25.99, "Clothing", 10, 'M');
        Customer customer1 = new Customer("Jonas", "jonas@gmail.com");

        OrderItem orderItem1 = new OrderItem(computer1, 3);
        Order order1 = new Order(1);
        order1.addProduct(computer1, 3);
        customer1.placeOrder(order1);

        OrderItem orderItem2 = new OrderItem(shirt1, 5);
        Order order2 = new Order(2);
        order2.addProduct(shirt1, 5);
        customer1.placeOrder(order2);
        
        customer1.getOrderStatistics();

    }
}