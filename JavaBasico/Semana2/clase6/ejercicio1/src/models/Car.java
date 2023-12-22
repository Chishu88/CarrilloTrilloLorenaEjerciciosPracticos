package models;

public class Car extends Vehicle implements Electrical{


   private int capacityBattery;
   private double autonomy;

    public Car(int id, String plate, String model, int year, double price, int capacityBattery, double autonomy) {
        super(id, plate, model, year, price);
        this.capacityBattery = capacityBattery;
        this.autonomy = autonomy;
    }

    public int getCapacityBattery() {
        return capacityBattery;
    }

    public void setCapacityBattery(int capacityBattery) {
        this.capacityBattery = capacityBattery;
    }

    public double getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(double autonomy) {
        this.autonomy = autonomy;
    }

    @Override
    public void vehicleAge() {
        int currentYear = 2023; // You can use the actual current year
        int age = currentYear - getYear();
        System.out.println("Age of the car: " + age + " years.");
    }

    @Override
    public void chargeEnergy() {
        System.out.println("Charging electric car power. Battery Capacity: " + getCapacityBattery() + " mAh.");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "capacityBattery=" + capacityBattery +
                ", autonomy=" + autonomy +
                '}';
    }
}
