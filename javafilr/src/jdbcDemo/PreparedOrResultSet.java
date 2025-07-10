package jdbcDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class PreparedOrResultSet {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Connection con= ConnectionProvider.getConnection();
        String q="select name,age from info where age>? order by age";
        PreparedStatement stmt=con.prepareStatement(q);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter age");
        int age=Integer.parseInt(br.readLine());
        stmt.setInt(1,age);
        ResultSet set=stmt.executeQuery();
        while(set.next()){
            String name = set.getString(1);
            int age1 =set.getInt(2);
            System.out.println("Name="+name +" Age="+age1);
        }
        stmt.close();
        con.close();


    }
}
