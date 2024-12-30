package JDBCConnection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JDBCConnecting {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String userName = "root";
    private static final String password = "Admin@123";
    private static final String query = "select * from students;";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully!!");

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());
        }
        //Step2:Connection Establishment:
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Established Successfully!!!");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Double marks = rs.getDouble("marks");


                System.out.println("++++++++---Students Data----++++++++++++++++");
                System.out.println("id       :" + id);
                System.out.println("Name     :" + name);
                System.out.println("Age      :" + age);
                System.out.println("Marks    :" + marks);
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
