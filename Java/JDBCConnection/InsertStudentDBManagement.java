package JDBCConnection;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertStudentDBManagement {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String userName = "root";
    private static final String password = "Admin@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.JdbcConnection");
            System.out.println("Driver Loaded Successfully!!!");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection established successfully!!!!");
            //Statement statement = connection.createStatement();
            String query = "delete from students where name='Ankita';";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            int affected = preparedStatement.executeUpdate(query);
            if (affected > 0) {
                System.out.println("rows Updated Successfully!!!!");

            } else {
                System.out.println("Rows not updated successfully!!!");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}