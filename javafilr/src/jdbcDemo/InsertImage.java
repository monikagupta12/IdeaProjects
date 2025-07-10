package jdbcDemo;

import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;

public class InsertImage {
    public static void main(String[] args) throws SQLException, IOException {
        Connection con=ConnectionProvider.getConnection();

        String q="insert into picture (pic,date) values (?,?)";
        PreparedStatement statement=con.prepareStatement(q);

        FileInputStream fis=new FileInputStream("C:\\Users\\degup\\Downloads\\mypic.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        Timestamp t1= Timestamp.valueOf(LocalDateTime.now());

        statement.setBytes(1,data);
        statement.setTimestamp(2,t1);
        statement.executeUpdate();
        fis.close();

        System.out.println("--done--");

    }
}
