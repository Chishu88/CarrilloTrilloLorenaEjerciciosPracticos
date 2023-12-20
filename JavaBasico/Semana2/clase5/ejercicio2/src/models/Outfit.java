package models;

public class Outfit {

    //código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

    private int code;
    private String name;
    private double price;
    private String brand;
    private int size;
    private String color;

    public Outfit() {
    }

    public Outfit(int code, String name, double price, String brand, int size, String color) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.color = color;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Outfit{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public void showOutfit(){
        System.out.println("Show outfit");
    }
}
