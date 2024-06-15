package org.example.database;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ProductMain {

    private ProductDAO productDAO = new ProductDAO();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        String productName = getInputProductName();
        List<Product> products = productDAO.findProductNameLike(productName);
        printProducts(products);

        Product selectedProduct = null;

        while(selectedProduct == null) {
            int productId = getInputProductId();
            selectedProduct = productDAO.findById(productId);
            if(selectedProduct == null){
                System.out.println("You entered an invalid product id.");
            }
        }

        System.out.println(selectedProduct);

        int newProductQuantity = getInputNewProductQuantityInStock();
        updateProductQuantityInStock(selectedProduct, newProductQuantity);
    }

    public void printProducts(List<Product> products){
        for(Product product: products) {
            System.out.println(product.getId() + " | " + product.getProductName() + " | " + product.getQuantityInStock());
        }
    }

    public String getInputProductName() {
        while(true) {
            try {
                System.out.print("Enter a product name to search for: ");
                String productName = scanner.nextLine();
                return productName;
            } catch(Exception e) {
                System.out.print("Please enter a valid number: ");
                scanner.nextLine();
            }
        }
    }

    public int getInputProductId() {
        while(true) {
            try {
                System.out.print("Enter a product id to modify: ");
                int productId = scanner.nextInt();
                return productId;
            } catch(Exception e) {
                System.out.print("Please enter a valid number: ");
                scanner.nextLine();
            }
        }
    }

    public int getInputNewProductQuantityInStock() {
        while(true) {
            try {
                System.out.print("Enter the new value for quantity in stock: ");
                int quantity = scanner.nextInt();
                return quantity;
            } catch(Exception e) {
                System.out.print("Please enter a valid number: ");
                scanner.nextLine();
            }
        }
    }

    public void updateProductQuantityInStock(Product product, int quantity){
        product.setQuantityInStock(quantity);
        productDAO.update(product);
    }

    public static void main(String[] args) {
        ProductMain pm = new ProductMain();
        pm.run();
    }
}
