import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;

public class jdbc10 {
    public static void main(String [] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/mono";
            String user="root";
            String pass="apple";
            Connection con =DriverManager.getConnection(url, user, pass);
            FileReader fr=new FileReader("a1.txt");
            String q="insert into hi(id,file)values(?,?)";
            PreparedStatement stm=con.prepareStatement(q);
            stm.setInt(1,1);
            stm.setCharacterStream(2, fr);
            stm.executeUpdate();
    
            con.close();
            System.out.println("success");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
