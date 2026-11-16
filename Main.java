
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Restaurant restaurant = new Restaurant();

        System.out.println("================================");
        System.out.println("   WELCOME TO OUR RESTAURANT");
        System.out.println("================================");

        System.out.print("Enter customer name: ");
        String name = input.nextLine().trim();

        if (name.isEmpty()) {

            name = "Guest";
           }

        Order order = new Order(1, name);

        int choice;

        do {
            System.out.println("\n1. Display Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. Display Order");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    restaurant.displayMenu();
                    break;

                case 2:
                    restaurant.displayMenu();

                    System.out.print("Enter item ID: ");
                    int id = input.nextInt();

                    MenuItem item = restaurant.findItem(id);

                    if (item != null) {
                        order.addItem(item);
                    } else {
                        System.out.println("Item not found!");
                    }
                    break;

                case 3:
                    order.displayOrder();
                    break;

                case 4:
                    System.out.println("Thank you for visiting!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}
