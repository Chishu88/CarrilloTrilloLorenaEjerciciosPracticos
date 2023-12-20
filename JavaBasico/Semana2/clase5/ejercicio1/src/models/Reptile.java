package models;

public class Reptile extends Animal{

    private double lenght;
    private String scaleType;
    private String venomType;
    private String habitat;

    public Reptile(){

    }

    public Reptile(int id, String name, int age, String skinType, String foodType, double lenght, String scaleType, String venomType, String habitat) {
        super(id, name, age, skinType, foodType);
        this.lenght = lenght;
        this.scaleType = scaleType;
        this.venomType = venomType;
        this.habitat = habitat;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getScaleType() {
        return scaleType;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }

    public String getVenomType() {
        return venomType;
    }

    public void setVenomType(String venomType) {
        this.venomType = venomType;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hello, I'm a reptile");
    }
}

