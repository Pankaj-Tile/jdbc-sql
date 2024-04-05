import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class jdbc8 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mono";
            String user ="root";
            String pass="apple";
            Connection con=DriverManager.getConnection(url, user, pass);
            String q="select * from student;";
            PreparedStatement stm= con.prepareStatement(q);
            ResultSet set= stm.executeQuery(q);
            ResultSetMetaData data=set.getMetaData();
            System.out.println("colomn count:"+ data.getColumnCount());
            System.out.println("colomn 1 name:"+ data.getColumnName(1));
            System.out.println("colomn 2 name:"+ data.getColumnName(2));
            System.out.println("colomn 1 type name:"+ data.getColumnTypeName(1));
            System.out.println("colomn 2 type name:"+ data.getColumnTypeName(2));
        con.close();

          
    }
}
