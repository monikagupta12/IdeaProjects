package jdbcDemo;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.sql.SQLException;


public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("hello word");
        getConnection();

    }
    public static Connection getConnection(){
        try {
                        String driver="com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/student";
            Class cc=Class.forName(driver);
            System.out.println(cc);
            String username = "root";
            String password = "abcd";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con);
            System.out.println("connected to database");
        } catch (Exception e) {
            System.out.println("connection failed with error: " + e.getMessage());
        }
        return null;
    }

}
