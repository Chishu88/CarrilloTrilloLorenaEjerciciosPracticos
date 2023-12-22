import models.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mobile", "Samsung", "Electronics", 200.0, 400.0, 50));
        products.add(new Product(2, "Laptop", "Dell", "Computer", 800.0, 1200.0, 20));
        products.add(new Product(3, "Earphones", "Sony", "Audio", 50.0, 100.0, 100));
        products.add(new Product(4, "Charger", "Anker", "Accessory", 10.0, 20.0, 200));
        products.add(new Product(5, "Tablet", "Apple", "Computer", 300.0, 500.0, 30));
        products.add(new Product(6, "Mobile", "Samsung2", "Electronics", 300.0, 500.0, 60));
        products.add(new Product(7, "Laptop", "Dell2", "Computer", 900.0, 1300.0, 30));
        products.add(new Product(8, "Earphones", "Sony2", "Audio", 60.0, 200.0, 200));
        products.add(new Product(9, "Charger", "Anker2", "Accessory", 20.0, 30.0, 300));
        products.add(new Product(10, "Tablet", "Apple2", "Computer", 400.0, 600.0, 40));

        // b) Save these created objects in an ArrayList.
        System.out.println("Products created and stored in the inventory:");

        for (Product product : products) {
            System.out.println(product);
        }

        // c) Iterate over the ArrayList and determine the product with the highest selling price.
        Product highestSalePriceProduct = products.get(0);
        for (Product product : products) {
            if (highestSalePriceProduct.getSalePrice() < product.getSalePrice()) {
                highestSalePriceProduct = product;
            }
        }

        System.out.println("\nThe product with the highest selling price is: ");
        System.out.println(highestSalePriceProduct.toString());

        // d) Iterate over the ArrayList and determine the product with the lowest cost price.
        Product lowestCostPriceProduct = products.get(0);
        for (Product product : products) {
            if (lowestCostPriceProduct.getCostPrice() > product.getCostPrice()) {
                lowestCostPriceProduct = product;
            }
        }

        System.out.println("\nThe product with the lowest cost price is: ");
        System.out.println(lowestCostPriceProduct.toString());

        // e) Delete the product at position 5 in the ArrayList.
        int positionToDelete = 5;
        if (positionToDelete >= 0 && positionToDelete < products.size()) {
            System.out.println("\nDeleting at index 5: ");
            System.out.println(products.remove(positionToDelete));
        } else {
            System.out.println("\nThe position to delete is not valid.");
        }

        // f) Determine the product with the highest quantity in stock. Deduct 3 units from its stock and update the record in the list based on that.
        Product highestStockProduct = products.get(0);
        for (Product product : products) {
            if (product.getQuantityInStock() > highestStockProduct.getQuantityInStock()) {
                highestStockProduct = product;
            }
        }

        System.out.println("\nThe product with the most stock is: ");
        System.out.println(highestStockProduct.toString());

        System.out.println("\nSubtracting 3 from the stock");
        highestStockProduct.setQuantityInStock(highestStockProduct.getQuantityInStock() - 3);

        System.out.println("The new stock is: " + highestStockProduct.getQuantityInStock());

        // g) Print the complete list
        System.out.println("\nFinal list after all operations:");
        for (Product product : products)
            System.out.println(product.toString());
    }
}