package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Lorena", 1.500, "Developer"),
                new Employee("Miriam", 1.300, "Analyst"),
                new Employee("Diederik", 1.700, "Manager"),
                new Employee("Rafa", 1.400, "Developer"),
                new Employee("Eloisa", 1.450, "Analyst"),
                new Employee("Juan", 1.350, "Manager"),
                new Employee("Adriana", 1.350, "Developer"),
                new Employee("Laura", 1.650, "Analyst"));


        List<Employee> highestPaidEmployess = employees.stream()
                .filter(e -> e.getSalary() > 1.500)
                .collect(Collectors.toList());

        System.out.println("Employees with a salary of more than 1500:");
        highestPaidEmployess.forEach(System.out::println);
        System.out.println();


        Map<String, List<Employee>> employeesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory));


        System.out.println("Employees grouped by category:");
        employeesByCategory.forEach((category, employeeList) -> {
            System.out.println(category + ":");
            employeeList.forEach(System.out::println);

            double averageSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
            System.out.printf("Average salary: %.2f%n", averageSalary);
            System.out.println();
        });

        Optional<Employee> hightSalary = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("Highest paid employee: ");
        hightSalary.ifPresent(System.out::println);

    }
}