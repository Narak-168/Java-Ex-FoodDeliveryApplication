package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<MenuItem> menu;
    private List<Order> orders;

    public Restaurant(){
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addToMenu(MenuItem item){
        menu.add(item);
        System.out.println(item.name + "added to menu");
    }

    public void viewMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menu) {
            item.getDetails();
            System.out.println();
        }
    }

    public void processOrder(Order order){
        order.updateStatus("On Delivery");
        orders.add(order);
        System.out.println("Order processed. Status updated to 'On Delivery'.");
    }

}
