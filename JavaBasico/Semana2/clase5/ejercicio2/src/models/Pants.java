package models;

public class Pants extends Outfit{
    //  estilo, tipoTejido

    private String style;
    private String fabricType;

    public Pants(){

    }

    public Pants(int code, String name, double price, String brand, int size, String color, String style, String fabricType) {
        super(code, name, price, brand, size, color);
        this.style = style;
        this.fabricType = fabricType;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "style='" + style + '\'' +
                ", fabricType='" + fabricType + '\'' +
                '}';
    }

    @Override
    public void showOutfit(){
        System.out.println("These pants are brand name: " + getStyle());
    }
}
