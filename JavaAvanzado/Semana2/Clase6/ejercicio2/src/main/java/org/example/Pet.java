package org.example;

public class Pet <T>{

    private static int counter = 1;
    private int id;
    private String name;
    private int age;
    private T specie;

    public Pet() {
    }

    public Pet(String name, int age, T specie) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.specie = specie;
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

    public T getSpecie() {
        return specie;
    }

    public void setSpecie(T specie) {
        this.specie = specie;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", species='" + specie + '\'' +
                '\n';
    }
}
