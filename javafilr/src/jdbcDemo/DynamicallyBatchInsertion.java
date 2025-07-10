package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicallyBatchInsertion {
    public static void main(String[] args) throws SQLException {
        Connection con =ConnectionProvider.getConnection();
        con.setAutoCommit(false);
        String q="insert into info (name,age) values (?,?)";
        PreparedStatement stmt=con.prepareStatement(q);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total enteries");
        int num=sc.nextInt();
        while(num!=0){
            System.out.println("Enter name :");
            String name=sc.next();
            System.out.println("Enter age :");
            int age=sc.nextInt();

            stmt.setString(1,name);
            stmt.setInt(2,age);
            stmt.addBatch();
            num--;
        }
        con.commit();
        stmt.close();

    }
}
