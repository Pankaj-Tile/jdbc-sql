import java.sql.DriverManager;

import java.sql.Statement;
import java.sql.Connection;;

public class jdbc2 {
    public static void main(String [] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/mono";
            String user="root";
            String pass="apple";
            Connection con =DriverManager.getConnection(url, user, pass);

            String q="create table student(id int,name varchar(10));";
            Statement stm=con.createStatement();
            stm.executeUpdate(q);
            con.close();
            System.out.println("success");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
