package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertion {
    public static void main(String[] args) throws SQLException {
        Connection con=ConnectionProvider.getConnection();
        System.out.println("connection estabished");
        con.setAutoCommit(false);
        Statement stmt=con.createStatement();
        stmt.addBatch("insert into info (name,age) values ('kriti',15)");
        stmt.addBatch("insert into info (name,age) values ('sonu',14)");
        stmt.addBatch("insert into info (name,age) values ('bitu',15)");
        stmt.addBatch("insert into info (name,age) values ('ponam',26)");
        int[]affect=stmt.executeBatch();
        con.commit();
        System.out.println("bach inserted");


    }
}
