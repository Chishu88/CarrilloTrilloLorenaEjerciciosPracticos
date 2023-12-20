package models;

public class Bird extends Animal {

    /*"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.*/

    private double wingspan;
    private String flightType;
    private String featherColor;
    private String beakType;

    public Bird(){

    }

    public Bird(int id, String name, int age, String skinType, String foodType, double wingspan, String flightType, String featherColor, String beakType) {
        super(id, name, age, skinType, foodType);
        this.wingspan = wingspan;
        this.flightType = flightType;
        this.featherColor = featherColor;
        this.beakType = beakType;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    @Override
    public void saludar() {
        System.out.println("Hello, I'm a bird");
    }
}
