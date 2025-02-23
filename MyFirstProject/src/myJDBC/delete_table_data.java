package myJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class delete_table_data {
    public void deleteData(){
        Connection connection = null;
        Statement stm = null;

        try {
            String url = "jdbc:mysql://localhost:3306/sadashish";
            String userName = "root";
            String password = "12345";

            connection = DriverManager.getConnection(url,userName,password);

            stm = connection.createStatement();

            String sql = "DELETE FROM student WHERE sid = 3;";
            stm.executeUpdate(sql);

            System.out.println("Data deleted Successfully");

            connection.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
