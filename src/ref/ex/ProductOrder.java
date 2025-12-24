package ref.ex;

public class ProductOrder {
    String productName;
    double price;
    int quantity;

    static public ProductOrder createOrder(String productName, double price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public void printOrder() {
        System.out.println(productName + " " + price + " " + quantity);
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}
