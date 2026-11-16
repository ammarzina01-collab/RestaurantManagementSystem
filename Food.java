public class Food extends MenuItem {

    public Food(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void display() {
        System.out.println("[FOOD] " + getId() + " - "
                + getName() + " - " + getPrice() + " TND");
    }
}
