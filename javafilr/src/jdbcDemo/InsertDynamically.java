package jdbcDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDynamically {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "abcd";
        Connection con = DriverManager.getConnection(url, username, password);
        String q = "insert into account (accountNo,amount) values (?,?)";
        PreparedStatement stmt= con.prepareStatement(q);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter accountNo =");
        String name=br.readLine();
        System.out.println("enter amount=");
        double amount=Double.parseDouble(br.readLine());
        stmt.setString(1,name);
        stmt.setDouble(2,amount);
        stmt.executeUpdate();
        stmt.close();
        con.close();
        System.out.println("---done----");
    }

}
