package myJDBC;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


class create_student_table {

        public void  createTable(){
            Connection connection = null;
            Statement statement = null;

            try {
                String url = "jdbc:mysql://localhost:3306/sadashish";
//                String databaseName = "prem";
                String userName = "root";
                String password = "12345";

                // Establish the connection to MySQL

                connection = DriverManager.getConnection(url, userName, password);

                // Construct SQL query for creating database
                String sql = "create table student (sid int(3) , sname varchar(100), email varchar(200))";

                // Create statement object
                statement = connection.createStatement();

                // Execute the query to create the database
                statement.execute(sql);
                // Show success message in the dialog box
                JOptionPane.showMessageDialog(null, "Table " + " created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                // close connection with database
                connection.close();

            } catch (Exception e) {
                // Show error message in case of an exception
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


