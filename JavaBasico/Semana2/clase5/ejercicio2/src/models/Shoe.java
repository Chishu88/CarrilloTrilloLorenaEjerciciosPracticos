package models;

public class Shoe extends Outfit{
    //material, tipoCierre

    private String material;
    private String closureType;

    public Shoe(){

    }

    public Shoe(int code, String name, double price, String brand, int size, String color, String material, String closureType) {
        super(code, name, price, brand, size, color);
        this.material = material;
        this.closureType = closureType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getClosureType() {
        return closureType;
    }

    public void setClosureType(String closureType) {
        this.closureType = closureType;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "material='" + material + '\'' +
                ", closureType='" + closureType + '\'' +
                '}';
    }

    @Override
    public void showOutfit(){
        System.out.println("These shoes are branded: " + getBrand());
    }
}
