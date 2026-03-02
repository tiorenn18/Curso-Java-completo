package database.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.classes.ConnectionFactory;
import database.classes.DbExecption;

public class Program {
    public static void main(String[] args) throws DbExecption {

        try (Connection conn = ConnectionFactory.getConnection();
            Statement st = conn.createStatement(); 
        ) {
            conn.setAutoCommit(false);
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

           // int x = 1;
           // if (x < 2) {
           //     throw new SQLException("Fake Error");
           // }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("Rows1 =" + rows1);
            System.out.println("Rows2 =" + rows2);


        } catch (SQLException e) {
            try {
                Connection conn = ConnectionFactory.getConnection();
                conn.rollback();
                throw new DbExecption("Transaction rollet back! caused by: " + e.getMessage());
            } catch (SQLException el) {
                throw new DbExecption("Error trying to roll back! Caused by: " +el.getMessage());
            }
        }
    }
}