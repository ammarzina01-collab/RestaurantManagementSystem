
import java.util.ArrayList;

public class Order {

    private int orderId;
    private String customerName;
    private ArrayList<MenuItem> items;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
        System.out.println(item.getName() + " added to order.");
    }

    public double calculateTotal() {
        double total = 0;

        for (MenuItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public void displayOrder() {
        System.out.println("\n===== ORDER RECEIPT =====");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);

        for (MenuItem item : items) {
            item.display();
        }

        System.out.println("-------------------------");
        System.out.println("Total: " + calculateTotal() + " TND");
    }
}
