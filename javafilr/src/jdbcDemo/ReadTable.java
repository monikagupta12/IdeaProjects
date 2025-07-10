package jdbcDemo;

import java.sql.*;

public class ReadTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/student";
        String username="root";
        String password="abcd";
        Connection con= DriverManager.getConnection(url,username,password);
        String q="select * from info";
        Statement stmt= con.createStatement();
        ResultSet set=stmt.executeQuery(q);
        while(set.next()){
            String name = set.getString(1);
            int age =set.getInt(2);
            System.out.println("Name="+name +" Age="+age);

        }
        stmt.close();
        con.close();
    }
}
