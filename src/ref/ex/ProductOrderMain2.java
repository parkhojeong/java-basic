package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order = ProductOrder.createOrder("A", 5000, 1);
        ProductOrder order1 = ProductOrder.createOrder("B", 2000, 1);
        ProductOrder[] orders = {order, order1};

        double totalPrice = 0;
        for (ProductOrder productOrder : orders) {
            productOrder.printOrder();
            totalPrice += productOrder.getTotalPrice();
        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
