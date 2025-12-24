package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder a = new ProductOrder("A", 5000, 1);
        ProductOrder b = new ProductOrder("B", 2000, 1);
        ProductOrder c = new ProductOrder("C", 1500, 12);

        ProductOrder[] orders = {a, b, c};
        double totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.getTotalPrice();
        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
