package org.example;

import org.example.database.dao.OrderDAO;
import org.example.database.entity.Order;

import java.util.List;
import java.util.Scanner;

public class CustomerOrdersMain {
    Scanner scanner = new Scanner(System.in);
    OrderDAO orderDAO = new OrderDAO();

    public void run() {
        int customerId = getCustomerId();

        System.out.println(customerId);
        List<Order> orders = orderDAO.findByCustomerId(customerId);
        System.out.println("orderId | customerId | status | comments");

        for(Order order: orders){
            System.out.println(order.getId() + " | " + order.getCustomerId() + " | " + order.getStatus() + " | " + order.getComments() + " | " + order.getCustomer() );
        }
    }

    public static void main(String[] args) {
        CustomerOrdersMain main = new CustomerOrdersMain();
        main.run();
    }

    public int getCustomerId(){
        while(true){
             try    {
                 System.out.print("Please enter a customer id: ");
                 int customerId = scanner.nextInt();
                 return customerId;
             } catch (Exception e) {
                 System.out.println("Please enter a valid customer id number");
                 scanner.nextLine();
             }
        }
    }
}
