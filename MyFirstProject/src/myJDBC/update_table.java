package myJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class update_table {
    public void updateData(){
        Connection connection = null;
        Statement stm = null;

        try {
            String url = "jdbc:mysql://localhost:3306/sadashish";
            String userName = "root";
            String password = "12345";

            connection = DriverManager.getConnection(url,userName,password);

            String sql = "UPDATE student set sid = ? where sname = ?";

            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setInt(1,3);
            pstm.setString(2,"sadashish");

            pstm.execute();
            System.out.println("Update data Successfully");

            connection.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
