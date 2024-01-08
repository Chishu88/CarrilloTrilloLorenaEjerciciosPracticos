package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create instance of cars
        Car car1 = new Car("Kia", "Picanto", "2010", 10000.0);
        Car car2 = new Car("Volkswagen", "Golf", "2019", 20000.0);
        Car car3 = new Car("Ford", "Fiesta", "2021", 18000.0);
        Car car4 = new Car("kia", "Ceed", "2019", 16500.0);
        Car car5 = new Car("Renault", "Megan", "2021", 16800.0);

        // Create instance of InventoryCars and add cars
        InventaryCars<Car> inventaryCars = new InventaryCars<>();
        inventaryCars.addCar(car1);
        inventaryCars.addCar(car2);
        inventaryCars.addCar(car3);
        inventaryCars.addCar(car4);
        inventaryCars.addCar(car5);

        // Search cars by year.
        List<Car> searchByYear = inventaryCars.searchByYear("2021");
        System.out.println("Cars by year 2021: " + searchByYear);

        // Get all cars in the inventary.
        List<Car> allCars = inventaryCars.showAllCars();
        System.out.println("Show all cars: " + allCars);

        // Search cars by brand.
        List<Car> searchByBrand = inventaryCars.searchByBrand("Kia");
        System.out.println("Show all cars of Kia: " + searchByBrand);

        // Total inventary.
        double totalValue = inventaryCars.calculateTotalValue();
        System.out.println("Calculate total value of inventory: " + totalValue + "€");


    }
}