public class OrderItem {
    private Product product;
    private int quantity;

    OrderItem (Product product, int quantity){
        this.product=product;
        this.quantity=quantity;
    }
    public double getSubtotal (){
//        double total = 0;
//        if (quantity > 1 && quantity < 5){
//            total = product.applyDiscount();
//        }
//        else {
//            total = product.applyBulkDiscount();
//        }
//
//        return total;
        return quantity * product.price;
    }
}
