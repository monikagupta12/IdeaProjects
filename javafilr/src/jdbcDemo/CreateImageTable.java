package jdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateImageTable {
    public static void main(String[] args) throws SQLException {
        Connection con=ConnectionProvider.getConnection();
        String q="create table picture (id int auto_increment primary key,pic longblob not null,date timestamp)";
        Statement stmt=con.createStatement();
        stmt.executeUpdate(q);
        System.out.println("done");

    }
}
