package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TranstionHandling {
    public static void main(String[] args) throws SQLException {
        Connection con=ConnectionProvider.getConnection();
        String debit="update account set amount=amount+? where accountNo=?";
        String credit="update account set amount=amount-? where accountNo=?";
        try {
            con.setAutoCommit(false);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Depbit Account No");
            String debitNo=sc.next();
            System.out.println("Enter Cradit Account No");
            String creditNo=sc.next();
            System.out.println("Enter amount transfer");
            double amount=sc.nextDouble();
            PreparedStatement debitSt=con.prepareStatement(debit);
            PreparedStatement creditSt=con.prepareStatement(credit);
            debitSt.setDouble(1,amount);
            debitSt.setString(2,debitNo);
            creditSt.setDouble(1,amount);
            creditSt.setString(2,creditNo);
            int debitRow=debitSt.executeUpdate();
            int creaditRow=creditSt.executeUpdate();
            if(debitRow>0 && creaditRow>0) {
                con.commit();
                System.out.println("done.....");
            }
            else{
                con.rollback();
                System.out.println("failed....");
            }

            creditSt.close();
            debitSt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        con.close();

    }
}
