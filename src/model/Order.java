package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<MenuItem> items;
    private String status;

    public Order(int orderId){
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.status = "Pending";
    }

    public void addItem(MenuItem menuItem){
        items.add(menuItem);
    }

    public void removeItem(MenuItem menuItem){
        items.remove(menuItem);
    }

    public float calculateTotal(){
        float total = 0;
        for (MenuItem item : items){
            total += item.price;
        }
        return total;
    }

    public void updateStatus(String newStatus){
        this.status = newStatus;

    }

    public void displayOrderDetails(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
        System.out.println("Items: ");
        for (MenuItem item : items){
            item.getDetails();
        }
        System.out.println("Total Price: " + calculateTotal());
    }
}
