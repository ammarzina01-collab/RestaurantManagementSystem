
import java.util.ArrayList;

public class Restaurant {

    private ArrayList<MenuItem> menu;

    public Restaurant() {
        menu = new ArrayList<>();

        menu.add(new Food(1, "Pizza", 18));
        menu.add(new Food(2, "Burger", 15));
        menu.add(new Food(3, "Pasta", 20));

        menu.add(new Drink(4, "Juice", 6));
        menu.add(new Drink(5, "Water", 2));
    }

    public void displayMenu() {
        System.out.println("\n===== RESTAURANT MENU =====");

        for (MenuItem item : menu) {
            item.display();
        }
    }

    public MenuItem findItem(int id) {
        for (MenuItem item : menu) {
            if (item.getId() == id) {
                return item;
            }
        }

        return null;
    }
}
