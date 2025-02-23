package JDBC_Final_Project;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management");
            System.out.println("1 = Create \n2 = Read \n3 = Update \n4 = Delete \n5 = Exit");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    // Create new employee
                    System.out.println("Enter employee details (id, name, email, salary):");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline character
                    String name = sc.nextLine();
                    String email = sc.nextLine();
                    int salary = sc.nextInt();
                    Employee emp = new Employee(id, name, email, salary);
                    EmployeeDao.createEmployee(emp);
                    System.out.println("Employee created successfully.");
                    break;

                case 2:
                    // Read all employees
                    ArrayList<Employee> employees = EmployeeDao.readAllEmployees();
                    System.out.println("Employees List:");
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    // Update employee
                    System.out.println("Enter employee id to update:");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // consume newline character
                    System.out.println("Enter new name:");
                    String newName = sc.nextLine();
                    EmployeeDao.updateEmployee(updateId, newName);
                    System.out.println("Employee updated successfully.");
                    break;

                case 4:
                    // Delete employee
                    System.out.println("Enter employee id to delete:");
                    int deleteId = sc.nextInt();
                    EmployeeDao.deleteEmployee(deleteId);
                    System.out.println("Employee deleted successfully.");
                    break;

                case 5:
                    // Exit program
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}
