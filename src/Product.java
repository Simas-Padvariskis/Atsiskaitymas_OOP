interface Discountable {
    void applyDiscount (double discount);
    void applyBulkDiscount (int quantity, double discount);
}

public abstract class Product {
    private String productName;
    protected double price;
    private String category;
    private int stock;

    Product (String productName, double price, String category, int stock){
        this.productName=productName;
        this.price=price;
        this.category=category;
        this.stock=stock;
    }

    public void applyDiscount (double discount){
        price = price - (price / 100 * discount);
    }

    public void applyBulkDiscount (int quantity, double discount){
        if (quantity >= 5 && quantity < 10){
            price = price - (price / 100 * (discount+5));
        }
        else if (quantity >= 10){
            price = price - (price / 100 * (discount+10));
        }
    }
}
