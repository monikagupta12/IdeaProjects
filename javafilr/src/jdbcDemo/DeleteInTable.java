package jdbcDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteInTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        String url="jdbc:mysql://localhost:3306/student";
        String usename="root";
        String password="abcd";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,usename,password);
        String q="delete from info where age > ?";
        PreparedStatement stmt=con.prepareStatement(q);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter age for delete");
        int age=Integer.parseInt(br.readLine());
        stmt.setInt(1,age);
        stmt.executeUpdate();
        stmt.close();
        con.close();


    }
}
