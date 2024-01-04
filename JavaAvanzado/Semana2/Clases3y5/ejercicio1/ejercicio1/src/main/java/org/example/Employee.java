package org.example;

public class Employee {

    private String name;
    private Double salary;
    private String category;

    public Employee() {
    }

    public Employee(String name, Double salary, String category) {
        this.name = name;
        this.salary = salary;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Employees -> " +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", category='" + category + '\'';
    }
}
