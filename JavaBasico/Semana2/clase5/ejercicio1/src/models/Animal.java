package models;

public class Animal {

    private int id;
    private String name;
    private int age;
    private String skinType;
    private String foodType;


    public Animal() {
    }

    public Animal(int id, String name, int age, String skinType, String foodType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.skinType = skinType;
        this.foodType = foodType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void saludar(){
        System.out.println("Hello, I'm an animal");
    }
}