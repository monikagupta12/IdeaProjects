package jdbcDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="abcd";
        Connection con= DriverManager.getConnection(url,username,password);
        String q="update info set age=? where name=?";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name");
        String name=br.readLine();
        System.out.println("enter new age");
        int age=Integer.parseInt(br.readLine());
        PreparedStatement stmt=con.prepareStatement(q);
        stmt.setInt(1,age);
        stmt.setString(2,name);
        stmt.executeUpdate();
        stmt.close();
        con.close();
        System.out.println("--done---");


    }
}
