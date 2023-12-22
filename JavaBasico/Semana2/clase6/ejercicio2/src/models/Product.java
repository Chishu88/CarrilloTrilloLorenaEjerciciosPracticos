package models;

import java.util.ArrayList;

public class Product {

    private int code;
    private String name;
    private String brand;
    private String type;
    private double costPrice;
    private double salePrice;
    private int quantityInStock;


    public Product() {
    }

    public Product(int code, String name, String brand, String type, double costPrice, double salePrice, int quantityInStock) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
        this.quantityInStock = quantityInStock;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
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
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", costPrice=" + costPrice +
                ", salePrice=" + salePrice +
                ", quantityInStock=" + quantityInStock +
                '}';
    }

    /*public void updateStock(int quantity) {
        this.quantityInStock -= quantity;
    }*/
}






