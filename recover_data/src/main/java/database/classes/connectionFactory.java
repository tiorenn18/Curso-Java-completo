package database.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/coursedb";
    private static final String USER = "developer";
    private static final String USER_PASSWORD = "12345";

    static Connection conn = null;

    public static Connection connectDatabase() throws SQLException{
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL, USER, USER_PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Erro " + e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement st){
        if (st != null) {
            try{
                st.close();
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs){
        if (rs != null) {
            try{
                rs.close();
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
