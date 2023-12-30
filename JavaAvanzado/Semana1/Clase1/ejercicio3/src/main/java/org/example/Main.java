package org.example;

import java.util.Scanner;


public class Main {

    private static final int VECTOR_SIZE = 15;
    private static int[] dataVector = new int[VECTOR_SIZE];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Store data");
            System.out.println("2. Access data");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    storeData(scanner);
                    break;
                case 2:
                    accessData(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

    private static void storeData(Scanner scanner) {
        System.out.print("Enter an index to store data: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer index.");
            scanner.nextLine(); // Consume the invalid input
            return;
        }

        int index = scanner.nextInt();

        try {
            if (index < 0 || index >= VECTOR_SIZE) {
                throw new ArrayIndexOutOfBoundsException("Invalid index. Index must be between 0 and " + (VECTOR_SIZE - 1) + ".");
            }

            System.out.print("Enter data to store: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer data.");
                scanner.nextLine(); // Consume the invalid input
                return;
            }

            int data = scanner.nextInt();

            dataVector[index] = data;
            System.out.println("Data stored at index " + index + ": " + data);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void accessData(Scanner scanner) {
        System.out.print("Enter an index to access data: ");
        int index = scanner.nextInt();

        try {
            if (index < 0 || index >= VECTOR_SIZE) {
                throw new ArrayIndexOutOfBoundsException("Invalid index. Index must be between 0 and " + (VECTOR_SIZE - 1) + ".");
            }

            int accessedData = dataVector[index];
            System.out.println("Data at index " + index + ": " + accessedData);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}