package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item1) {
        if(itemCount == items.length) {
            System.out.println("Cart is full");
            return;
        }
        items[itemCount++] = item1;
    }

    public void printItems() {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println(item.getName() + ", " + item.getTotalPrice());

        }
        System.out.println("totalPrice = " + getTotalPrice());
    }

    private int getTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
