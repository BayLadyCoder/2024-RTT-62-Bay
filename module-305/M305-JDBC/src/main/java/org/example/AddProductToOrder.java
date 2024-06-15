package org.example;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

import java.util.Scanner;

public class AddProductToOrder {

    private Scanner scanner = new Scanner(System.in);
    private OrderDAO orderDAO = new OrderDAO();
    private OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
    private ProductDAO productDAO = new ProductDAO();

    public void run() {
        // 1) Load an order from the database by id
        int orderId = getOrderIdFromUser();
        Order order = orderDAO.findById(orderId);


        // 2) Load a product from the database by id
        int productId = getProductIdFromUser();
        Product product = productDAO.findById(productId);

        Customer customer = order.getCustomer();

        System.out.println("This order is for customer with an id = " + customer.getId() + " and name = " + customer.getCustomerName());

        for(OrderDetail od: order.getOrderDetails()){
            System.out.println(od.getProduct().getProductName() + " | " + od.getQuantityOrdered() + " | " + od.getPriceEach());
        }

        System.out.println(order);
        System.out.println();
        System.out.println(product);


        // 3) Create a new OrderDetail object and add the order and the product
//        OrderDetail orderDetail = new OrderDetail();
        OrderDetail orderDetail = orderDetailDAO.findByOrderIdAndProductId(orderId, productId);

        if(orderDetail == null) {
            orderDetail = new OrderDetail();
            orderDetail.setQuantityOrdered(0);
        }

        orderDetail.setQuantityOrdered(orderDetail.getQuantityOrdered() + 1);

        orderDetail.setOrder(order);
        orderDetail.setProduct(product);
        orderDetail.setPriceEach(product.getMsrp());
        orderDetail.setOrderLineNumber(1);


        // 4) Save the OrderDetail object to the database
        if(orderDetail.getId() == null){
            orderDetailDAO.insert(orderDetail);
        } else {
            orderDetailDAO.update(orderDetail);
        }
    }

    public int getOrderIdFromUser(){
        System.out.print("Enter an order id: ");
        int orderId = scanner.nextInt();
        return orderId;
    }

    public int getProductIdFromUser(){
        System.out.print("Enter a product id: ");
        int productId = scanner.nextInt();
        return productId;
    }

    public static void main(String[] args) {
        AddProductToOrder runner = new AddProductToOrder();
        runner.run();
    }
}
