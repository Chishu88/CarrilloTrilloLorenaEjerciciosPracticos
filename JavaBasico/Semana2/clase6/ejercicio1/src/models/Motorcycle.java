package models;

public class Motorcycle extends Vehicle implements Combustion{

    private int displacement;
    private String typeEngine;

    public Motorcycle(int id, String plate, String model, int year, double price, int displacement, String typeEngine) {
        super(id, plate, model, year, price);
        this.displacement = displacement;
        this.typeEngine = typeEngine;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public void vehicleAge() {
        int currentYear = 2023; // You can use the actual current year
        int age = currentYear - getYear();
        System.out.println("Age of the motorcycle: " + age + " years.");

    }

    @Override
    public void chargeFuel() {
        System.out.println("Refueling the motorcycle. Displacement: " + getDisplacement() + " cc.");

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "displacement=" + displacement +
                ", typeEngine='" + typeEngine + '\'' +
                '}';
    }
}
