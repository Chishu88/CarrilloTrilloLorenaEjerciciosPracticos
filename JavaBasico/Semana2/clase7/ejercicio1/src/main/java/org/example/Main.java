package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/university";
        String user = "root";
        String password = "root";

        try {
            // Set connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Insert new student
            insertStudent(connection, "Miriam", 25, 85.5);
            insertStudent(connection, "Rafa", 22, 92.0);
            insertStudent(connection, "Diederik", 20, 78.5);
            insertStudent(connection, "Adriana", 22, 76.5);

            // Get list of students
            getListStudents(connection);

            // Close connection
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertStudent(Connection connection, String name, int age, double qualification) {
        try {
            // Before inserting, check if a student with the same ID already exists
            if (!studentExists(connection, name, age)) {
                Statement statement = connection.createStatement();
                String insertSQL = "INSERT INTO students (name, age, qualification) VALUES " +
                        "('" + name + "', " + age + ", " + qualification + ")";
                statement.executeUpdate(insertSQL);
                statement.close();
            } else {
                System.out.println("The student already exists in the database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean studentExists(Connection conexion, String name, int age) {
        try {
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM students WHERE name = '" + name + "' AND age = " + age;
            ResultSet result = statement.executeQuery(sql);
            boolean exists = result.next(); // Returns true if there are results
            result.close();
            statement.close();
            return exists;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    private static void getListStudents(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM students";
            ResultSet result = statement.executeQuery(sql);

            // Process the results
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                double qualification = result.getDouble("qualification");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Qualification: " + qualification);
            }

            // Close result set and statement
            result.close();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
