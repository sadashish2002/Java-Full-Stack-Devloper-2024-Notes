package JDBC_Final_Project;

import java.sql.Connection;
import java.sql.DriverManager;

public  class DB {
    static Connection conn = null;
    public static Connection connect(){
        try{
            String url = "jdbc:mysql://localhost:3306/sadashish";
            String userName = "root";
            String password = "12345";

            conn = DriverManager.getConnection(url,userName,password);


        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
