package models;

public class Mammal extends Animal{

    /*"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.*/

    private int numberLegs;
    private String reproductionType;
    private String coatColor;
    private String habitat;

    public Mammal(){

    }

    public Mammal(int id, String name, int age, String skinType, String foodType, int numberLegs, String reproductionType, String coatColor, String habitat) {
        super(id, name, age, skinType, foodType);
        this.numberLegs = numberLegs;
        this.reproductionType = reproductionType;
        this.coatColor = coatColor;
        this.habitat = habitat;
    }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        this.numberLegs = numberLegs;
    }

    public String getReproductionType() {
        return reproductionType;
    }

    public void setReproductionType(String reproductionType) {
        this.reproductionType = reproductionType;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hello, I'm a mammal");
    }
}
