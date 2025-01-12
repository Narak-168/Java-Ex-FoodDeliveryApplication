package model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<Order> orderHistory;

    public User(int userId, String name){
        this.userId = userId;
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(Order order){
        orderHistory.add(order);
        System.out.println("Order placed successfully.");
    }

    public void viewOrderHistory(){
        System.out.println("Customer: " + name);
        for (Order order : orderHistory){
            order.displayOrderDetails();
            System.out.println( );
        }
    }

}
