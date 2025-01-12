import model.*;

public class  FoodDeliveryApplication {
    public static void main(String[] args) {
        // Create a restaurant
        Restaurant restaurant = new Restaurant();
        System.out.println("===================Welcome to Mr.Rak Store===================");
        // Add items to the menu
        restaurant.addToMenu(new FoodItem("Burger", 8.99f, "Delicious beef burger", new String[]{"Beef", "Lettuce", "Cheese"}));
        restaurant.addToMenu(new DrinkItem("Coke", 1.99f, "Chilled soft drink", "Medium"));

        // View menu
        System.out.println("===================Our Menu===================");
        restaurant.viewMenu();

        // Create a user
        User user = new User(1, "Oun Lomphat");

        // Create an order
        Order order1 = new Order(99);
        order1.addItem(new FoodItem("Pizza", 12.99f, "Cheesy pizza", new String[]{"Cheese", "Tomato", "Basil"}));
        order1.addItem(new DrinkItem("Sprite", 1.99f, "Chilled soft drink", "Small"));

        System.out.println("===================New Order!!!===================");

        // Place order
        user.placeOrder(order1);

        // Process the order
        restaurant.processOrder(order1);

        // View order history
        System.out.println("===================Your Order History===================");
        user.viewOrderHistory();
    }
}
