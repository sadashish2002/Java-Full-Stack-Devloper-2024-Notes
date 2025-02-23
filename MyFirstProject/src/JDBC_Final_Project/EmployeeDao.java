package JDBC_Final_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {

    // Create a new employee
    public static void createEmployee(Employee employee) throws SQLException {
        Connection con = DB.connect();
        String query = Query.insert;

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getName());
        preparedStatement.setString(3, employee.getEmail());
        preparedStatement.setInt(4, employee.getSalary());

        System.out.println("\n PreparedStatement = " + preparedStatement + "\n Employee = " + employee);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    // Update employee details by ID
    public static void updateEmployee(int id, String name) throws SQLException {
        Connection con = DB.connect();
        String query = Query.update;

        PreparedStatement preparedStatement = con.prepareStatement(query);

        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);

        System.out.println("\n PreparedStatement = " + preparedStatement);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    // Delete an employee by ID
    public static void deleteEmployee(int id) throws SQLException {
        Connection con = DB.connect();
        String query = Query.delete;

        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1, id);

        System.out.println("\n PreparedStatement = " + preparedStatement);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    // Read all employees from the database
    public static ArrayList<Employee> readAllEmployees() throws SQLException {
        ArrayList<Employee> empList = new ArrayList<>();
        Connection con = DB.connect();
        String query = Query.select;
        Statement statement = con.createStatement();
        System.out.println("\n Statement = " + statement);
        ResultSet rs = statement.executeQuery(query);

        while (rs.next()) {
            Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            empList.add(emp);
        }
        rs.close();
        statement.close();
        return empList;
    }
}
