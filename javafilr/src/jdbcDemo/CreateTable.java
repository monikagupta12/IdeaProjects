package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection con = null;
        String q;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "abcd";
            con = DriverManager.getConnection(url, username, password);
            q = "create table account(accountNo varchar(50),amount double)";
            stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("---done---");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
