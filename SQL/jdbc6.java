import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.*;


public class jdbc6 {
    public static void main(String[] args) {
        try  {
        Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mono";
            String user ="root";
            String pass="apple";
            Connection con=DriverManager.getConnection(url, user, pass);
            String q="select * from student;";
            PreparedStatement stm=con.prepareStatement(q);
            ResultSet set=stm.executeQuery(q);
            while(set.next()){
            
            System.out.println(set.getInt(1)+" ");
            System.out.println(set.getString(2));
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
