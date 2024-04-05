import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

class jdbc1 {
    static final String DB_url = "jdbc:mysql://localhost:3306/";
    static final String User = "root";
    static final String Pass = "apple";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_url, User, Pass);
            Statement start = conn.createStatement();) {
            String sql = "create database mon;";
            start.executeUpdate(sql);
            System.out.println("created");
            conn.close();
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}