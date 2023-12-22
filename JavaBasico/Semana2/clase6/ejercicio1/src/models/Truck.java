package models;

public class Truck extends Vehicle implements Combustion{

    private int capacityTank;
    private double ConsumptionFuel;



    public Truck(int id, String plate, String model, int year, double price, int capacityTank, double consumptionFuel) {
        super(id, plate, model, year, price);
        this.capacityTank = capacityTank;
        ConsumptionFuel = consumptionFuel;
    }

    public int getCapacityTank() {
        return capacityTank;
    }

    public void setCapacityTank(int capacityTank) {
        this.capacityTank = capacityTank;
    }

    public double getConsumptionFuel() {
        return ConsumptionFuel;
    }

    public void setConsumptionFuel(double consumptionFuel) {
        ConsumptionFuel = consumptionFuel;
    }

    @Override
    public void vehicleAge() {
        int currentYear = 2022;
        int age = currentYear - getYear();
        System.out.println("Age of the truck: " + age + " years.");
    }

    @Override
    public void chargeFuel() {
        System.out.println("Refueling the truck. Tank Capacity: " + getCapacityTank() + " litres");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacityTank=" + capacityTank +
                ", ConsumptionFuel=" + ConsumptionFuel +
                '}';
    }
}
