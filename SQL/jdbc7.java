import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.util.*;


public class jdbc7 {
    public static void main(String[] args) {
        try  {
        Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/image";
            String user ="root";
            String pass="apple";
            Connection con=DriverManager.getConnection(url, user, pass);
            String q="select * from img;";
            PreparedStatement stm=con.prepareStatement(q);
            ResultSet set=stm.executeQuery(q);
            while(set.next()){
            
            System.out.println(set.getString(1)+" ");
            Blob b=set.getBlob(2);
            byte [] brr =b.getBytes(1, (int)b.length());
            FileOutputStream o=new FileOutputStream("01.jpg");
            o.write(brr);
            con.close();
            }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
