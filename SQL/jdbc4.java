import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.FileInputStream;
import java.sql.Connection;;

public class jdbc4 {
    public static void main(String [] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/image";
            String user="root";
            String pass="apple";
            Connection con =DriverManager.getConnection(url, user, pass);

            String q="insert into img(name,image) values(?,?);";
            PreparedStatement stm=con.prepareStatement(q);

            stm.setString(1, "pank");
            FileInputStream i=new FileInputStream("0.jpg");
            stm.setBinaryStream(2, i, i.available());
            stm.executeUpdate();

            con.close();
            System.out.println("success");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
