package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("a", 2000, 2);
        Item item2 = new Item("b", 1000, 2);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.printItems();
    }
}
