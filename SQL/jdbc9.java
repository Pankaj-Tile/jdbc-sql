import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class jdbc9 {
    public static void main(String[] args) {
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/mono";
            String user ="root";
            String pass="apple";
            Connection con=DriverManager.getConnection(url, user, pass);
            DatabaseMetaData d=con.getMetaData();
            System.out.println(d.getDatabaseProductName());
            System.out.println(d.getDriverName());
            System.out.println(d.getDriverVersion());

            con.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }          
    }
}
