package org.example;

public class Student {

    private int id;
    private String name;
    private int age;
    private double qualification;

    public Student() {
    }

    public Student(int id, String name, int age, double qualification) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.qualification = qualification;
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

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", qualification=" + qualification +
                '}';
    }
}
