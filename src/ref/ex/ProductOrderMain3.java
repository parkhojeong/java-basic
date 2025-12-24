package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter total product count: ");
        int totalQuantity = scanner.nextInt(); // 3\\n
        scanner.nextLine(); // 3\\n 중 \\n 처리. 입력 버퍼 비우기 위함

        ProductOrder[] orders = new ProductOrder[totalQuantity];
        for (int i = 0; i < totalQuantity; i++) {
            System.out.print("product: ");
            String productName = scanner.nextLine();

            System.out.print("price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = ProductOrder.createOrder(productName, price, quantity);
        }

        int totalPrice = 0;
        for (ProductOrder order : orders) {
            order.printOrder();
            totalPrice += order.getTotalPrice();
        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
