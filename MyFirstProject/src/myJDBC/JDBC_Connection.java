package myJDBC;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connection {
    public static void main(String[] args) {
        //driver load - we should not thingk about it

        //conn establish
        Connection connection = null;
        Statement statement = null;

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "vaishnavi";
            String userName = "root";
            String password = "12345";

            // Establish the connection to MySQL

            connection = DriverManager.getConnection(url, userName, password);

            // Construct SQL query for creating database
            String sql = "CREATE DATABASE " + databaseName;

            // Create statement object
            statement = connection.createStatement();

            // Execute the query to create the database
            statement.executeUpdate(sql);

            // Show success message in the dialog box
            JOptionPane.showMessageDialog(null, "Database " + databaseName + " created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            // Show error message in case of an exception
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close resources
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
