package myJDBC;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class read_table {

    public void readData(){
        Connection connection = null;
        Statement statement = null;

        try {
            String url = "jdbc:mysql://localhost:3306/sadashish";
            String userName = "root";
            String password = "12345";

            connection = DriverManager.getConnection(url, userName, password);

            String sql = "select * from student";

            statement = connection.createStatement();

          ResultSet rs =  statement.executeQuery(sql); // return  result set

            while(rs.next()){
                System.out.println("id = " + rs.getInt(1));
                System.out.println("name = " + rs.getString(2));
                System.out.println("email = " + rs.getString(3));
            }
            System.out.println("Read successfully");

            connection.close();

        } catch (Exception e) {
            // Show error message in case of an exception
            System.out.println(e.getMessage());
        }
    }
}
