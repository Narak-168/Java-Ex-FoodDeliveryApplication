import model.*;

public class  FoodDeliveryApplication {
    public static void main(String[] args) {
        // Create a restaurant
        Restaurant restaurant = new Restaurant();
        System.out.println("===================Welcome to Mr.Rak Store===================");
        // Add items to the menu
        restaurant.addToMenu(new FoodItem("នំបញ្ចុក", 3.5f, "អាហារសុខភាព", new String[]{"សាច់នំ", "បន្លែ", "ទឹកសម្ល"}));
        restaurant.addToMenu(new DrinkItem("ទឹកច្របាច់", 1.5f, "ភេសជ្ជៈធម្មជាតិ", "កណ្ដាល"));

        // View menu
        System.out.println("===================Our Menu===================");
        restaurant.viewMenu();

        // Create a user
        User user = new User(1, "Oun Lomphat");

        // Create an order
        Order order1 = new Order(99);
        order1.addItem(new FoodItem("នំពោត", 2.5f, "រស់ជាតិពិសេស", new String[]{"ពោត", "ខ្ទិះដូង", "ទឹកដោះគោ"}));
        order1.addItem(new DrinkItem("ទឹកម្នាស់", 1.5f, "រសជាតិជូរផ្អែម", "តូច"));

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
