package jdbcDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class GetImage {
    public static void main(String[] args) throws SQLException, IOException {
        Connection con=ConnectionProvider.getConnection();
        String q="select * from picture where id>2";
        Statement stmt=con.createStatement();
        ResultSet set=stmt.executeQuery(q);
        String folder= "C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\";
        int i=0;
        while(set.next()){
            int id=set.getInt(1);
            byte[] pic=set.getBytes(2);
            String picname="pic"+i+".jpg";
            String addres=folder+picname;
            Timestamp t1=set.getTimestamp(3);
            FileOutputStream fos=new FileOutputStream(addres);
            fos.write(pic);
            i++;
            fos.close();
            System.out.println("ID= "+id +"     picLocation= "+addres +"      time= "+t1 );
        }
        System.out.println("done");
    }
}
