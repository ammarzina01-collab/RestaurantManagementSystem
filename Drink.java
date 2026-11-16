public class Drink extends MenuItem {

    public Drink(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void display() {
        System.out.println("[DRINK] " + getId() + " - "
                + getName() + " - " + getPrice() + " TND");
    }
}

