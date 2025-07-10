package jdbcDemo;

import java.sql.*;

public class InsertIntoTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="abcd";
        Connection con= DriverManager.getConnection(url,username,password);
        String q="insert into info (name,age) values (?,?);";
        PreparedStatement stmt=con.prepareStatement(q);

        stmt.setString(1,"rita");
        stmt.setInt(2,22);
        stmt.executeUpdate();

        stmt.close();
        con.close();
        System.out.println("---done----");

    }
}
