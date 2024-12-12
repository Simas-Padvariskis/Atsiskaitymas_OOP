public class Clothing extends Product implements Discountable{
    private char size;

    Clothing(String name, double price, String category, int stock, char size){
        super(name, price, category, stock);
        this.size=size;
    }

    public void getSizeDetails (){
        System.out.println("Size: " + size);
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
