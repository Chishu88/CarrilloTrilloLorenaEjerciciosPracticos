package org.example.models;

import org.example.exception.InvalidProductException;
import org.example.exception.ProductAlreadyExistsException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int quantityInStock;

    public Product() {
    }

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }

    public static Map<String, Product> inventory = new HashMap<>();

    public static final int MAX_QUANTITY_AVAILABLE = 100;

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Enter the name of the product: ");
                String name = scanner.nextLine();

                // Check if the name is provided
                if (name.isEmpty()) {
                    System.out.println("Name is required for the product. Please enter a valid name.");
                    continue;  // Skip the rest of the loop and start over
                }

                double price;

                while (true) {
                    try {
                        System.out.println("Enter the price of the product: ");
                        String priceInput = scanner.nextLine();
                        price = Double.parseDouble(priceInput);

                        // Check if the price is greater than zero
                        if (price <= 0) {
                            System.out.println("Error: The price of the product must be greater than zero.");
                            continue;  // Skip the rest of the loop and start over
                        }
                        break;  // Break out of the loop if the input is valid
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Enter a valid number for the price.");
                    }
                }

                int quantityInStock;

                while (true) {
                    try {
                        System.out.println("Enter the quantity available for the product: ");
                        String quantityInput = scanner.nextLine();
                        quantityInStock = Integer.parseInt(quantityInput);

                        // Check if the quantity is valid
                        if (quantityInStock <= 0 || quantityInStock > MAX_QUANTITY_AVAILABLE) {
                            throw new InvalidProductException("Invalid quantity available for the product.");
                        }
                        break;  // Break out of the loop if the input is valid
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Enter a valid number for the quantity.");
                    }
                }

                // Check if the product already exists in the inventory
                if (inventory.containsKey(name)) {
                    throw new ProductAlreadyExistsException("The product '" + name + "' already exists in the inventory.");
                }

                // Add the product to the inventory
                Product newProduct = new Product(name, price, quantityInStock);
                inventory.put(name, newProduct);
                System.out.println("Product added to the inventory: " + newProduct);

                System.out.println("Do you want to add another product? (yes/no)");
                String userInput = scanner.nextLine();
                if (!userInput.equalsIgnoreCase("yes")) {
                    break;
                }

            } while (true);
        } catch (InvalidProductException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
