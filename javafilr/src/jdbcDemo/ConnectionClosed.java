package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClosed {
    public static void main(String[] args)  {
        Connection con = null;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/empleyoo","root","abcd");
             if(con.isClosed()){
                 System.out.println("connection not create");
             }
             else{
                 System.out.println("connection create");
             }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally block");
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("---done----");


    }
}
