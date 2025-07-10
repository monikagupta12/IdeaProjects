package jdbcDemo;

import java.sql.*;
import java.util.Scanner;

public class DropTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="abcd";
        Connection con= DriverManager.getConnection(url,username,password);

        String q= "Drop table account";
        Statement stmt=con.createStatement();
        stmt.executeUpdate(q);
        System.out.println("done");

    }
}
