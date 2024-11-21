/*
Syntax:
Step1:Loading Driver;
Class.forName("com.mysql.jdbc.Driver");

Step2:Connection Established
Connection con=DriverManager.getConnection(url,userName, password);

Step3:Create Statement
Statement stmt=con.createStatement();

step4:Executed SQL Query
ResultSet rs=stmt.executeQuery(query);

 */

package JDBCConnection;
import java.sql.*;
public class InsertemployeeDBManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tempdb";
        String username = "root";
        String password = "Admin@123";
        String query1="select * from employees";
        String query2="INSERT INTO employees(id, name, job_title, salary) VALUES(04, 'Smarat' ,'Network Management',30000.0 );";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully!!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!!!");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query1);

            int rowsAffected=stmt.executeUpdate(query2);
            if(rowsAffected>0){
                System.out.println("Database updated "+ rowsAffected+ "Successfully!!!");
            }

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                Double salary = rs.getDouble("salary");


                System.out.println("=======================");
                System.out.println("id        :" + id);
                System.out.println("Name      :" + name);
                System.out.println("Job Title :" + job_title);
                System.out.println("Salary    :" + salary);


            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection closed Successfully!!!!");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*

Syntax:
Step1:Loading Driver;
Class.forName("com.mysql.jdbc.Driver");

Step2:Connection Established
Connection con=DriverManager.getConnection(url,userName, password);

Step3:Create Statement
Statement stmt=con.createStatement();

step4:Executed SQL Query
ResultSet rs=stmt.executeQuery(query);

 */