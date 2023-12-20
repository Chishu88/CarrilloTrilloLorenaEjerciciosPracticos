package models;

public class Hat extends  Outfit{



    private String type;
    private String sizeHat;

    public Hat(){

    }

    public Hat(int code, String name, double price, String brand, int size, String color, String type, String sizeHat) {
        super(code, name, price, brand, size, color);
        this.type = type;
        this.sizeHat = sizeHat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSizeHat(){
        return sizeHat;
    }

    public void setSizeHat(String size) {
        this.sizeHat = size;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "type='" + type + '\'' +
                ", size=" + sizeHat +
                '}';
    }

    @Override
    public void showOutfit(){
        System.out.println("This hat is brand name: " + getType());
    }
}
