package myJDBC;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert_table {
    public void  insertData(){
        Connection connection = null;
        Statement statement = null;

        try {
            String url = "jdbc:mysql://localhost:3306/sadashish";
//                String databaseName = "sadashish";
            String userName = "root";
            String password = "12345";

            // Establish the connection to MySQL

            connection = DriverManager.getConnection(url, userName, password);

            // Create statement object
            statement = connection.createStatement();

            // Construct SQL query for creating database
            String sql = "INSERT into student VALUES (4,'Shariba' ,'shariba2002@gmail.com')";

            // Execute the query to create the database
//            statement.execute(sql);
                          // OR
            statement.executeUpdate(sql);
                        // OR
//            statement.executeQuery(sql); // not run

            // Show success message in the dialog box
            JOptionPane.showMessageDialog(null, "Data inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // close connection with database
            connection.close();

        } catch (Exception e) {
            // Show error message in case of an exception
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
