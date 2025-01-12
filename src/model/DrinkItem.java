package model;

public class DrinkItem extends MenuItem {

    private String size;

    public DrinkItem(String name, float price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }

    @Override
    public void getDetails() {
        System.out.println("Drink: " + name  + "\nPrice: " + price + "\nDescription: " + description + "\nSize: " + size );
    }
}
