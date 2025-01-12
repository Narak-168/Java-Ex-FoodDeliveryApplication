package model;

public class FoodItem extends MenuItem {
    private String [] ingredients;

    public FoodItem(String name, float price, String description, String[] ingredients){
        super(name, price, description);
        this.ingredients = ingredients;
    }

    @Override
    public void getDetails(){
        System.out.println("Food: " + name + "\nPrice: " + price + "\nDescription: " + description);
        System.out.println("Ingredients: " + String.join(",", ingredients));
    }

}
