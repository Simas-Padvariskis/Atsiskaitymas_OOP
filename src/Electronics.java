public class Electronics extends Product implements Discountable {
    String warrantyPeriod;

    Electronics(String name, double price, String category, int stock, String warrantyPeriod){
        super(name, price, category, stock);
        this.warrantyPeriod=warrantyPeriod;
    }

    public void checkWarranty(){
        System.out.println("Warranty period: " + warrantyPeriod);
    }

    @Override
    public void applyDiscount(double discount) {
        super.applyDiscount(discount);
    }

    @Override
    public void applyBulkDiscount(int quantity, double discount) {
        super.applyBulkDiscount(quantity, discount);
    }
}
