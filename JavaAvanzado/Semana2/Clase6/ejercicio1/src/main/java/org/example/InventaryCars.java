package org.example;

import java.util.ArrayList;
import java.util.List;

public class InventaryCars<T extends Car> {

    private List<T> listCars;

    public InventaryCars(){
        this.listCars = new ArrayList<>();
    }

    public void addCar(T car){
        listCars.add(car);
    }

    public List<T> searchByBrand(String brand){
        List<T> resultBrand = new ArrayList<>();
        for(T car : listCars){
            if(car.getBrand().equalsIgnoreCase(brand)){
                resultBrand.add(car);
            }
        }
        return resultBrand;
    }

    public List<T> searchByYear(String year){
        List<T> resultYear = new ArrayList<>();
        for(T car : listCars){
            if(car.getYear().equalsIgnoreCase(year)){
                resultYear.add(car);
            }
        }
        return resultYear;
    }

    public List<T> showAllCars(){
       return new ArrayList<>(listCars);
        }


    public double calculateTotalValue(){
        double totalValue = 0;
        for(T car : listCars){
            totalValue += car.getPrice();
        }
        return totalValue;
    }



}
