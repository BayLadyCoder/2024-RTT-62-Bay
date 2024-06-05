package org.example;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "changethis";

        System.out.println("-------- MySQL JDBC Connection Demo ------------");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connection connection = DriverManager.getConnection(dburl, user, password); String SelectSQL = "Select * FROM employees WHERE firstname = \"Leslie\"";
            // Connection connection = DriverManager.getConnection(dburl, user, password); String SelectSQL = "Select * FROM employees WHERE firstname = 'Leslie'";
            Connection connection = DriverManager.getConnection(dburl, user, password);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first name of the employee you want to search for: ");

            String input = scanner.nextLine();
            // String selectSQL = "Select * FROM employees WHERE firstname = '" + input + "'";
            // Statement stmt = connection.createStatement();
            // ResultSet result = stmt.executeQuery(selectSQL);

            String selectSQL = "Select * FROM employees WHERE firstname = ?";
            // use prepareStatement to prevent SQL injection
            PreparedStatement stmt = connection.prepareStatement(selectSQL);
            stmt.setString(1, input);
            ResultSet result = stmt.executeQuery();
            while(result.next())
            {
                String employeeID = result.getString("id");
                String fname = result.getString("firstname");
                String lname = result.getString("lastname");
                String email = result.getString("email");
                String job_title = result.getString("job_title");
                // System.out.println(employeeID +" | " + fname + "|"+ lname );

                String format = "%-10s | %-15s | %-15s | %-30s | %-20s%n";
                // Use printf to format the output
                System.out.printf(format, employeeID, fname, lname, email, job_title);
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
