package class1.ex;

public class ProductOrder {
    String productName;
    double price;
    int quantity;

    public ProductOrder(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
