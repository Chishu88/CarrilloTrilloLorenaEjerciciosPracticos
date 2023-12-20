package models;

public class Tshirt extends Outfit{


    private String sleeve;
    private String collar;

    public Tshirt(){

    }
    public Tshirt(int code, String name, double price, String brand, int size, String color, String sleeve, String collar) {
        super(code, name, price, brand, size, color);
        this.sleeve = sleeve;
        this.collar = collar;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "sleeve='" + sleeve + '\'' +
                ", collar='" + collar + '\'' +
                '}';
    }

    @Override
    public void showOutfit(){
        System.out.println("This t-shirt is brand name: " + getSleeve());
    }
}
