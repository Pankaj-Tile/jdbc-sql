import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.Connection;;

public class jdbc3 {
    public static void main(String [] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/mono";
            String user="root";
            String pass="apple";
            Connection con =DriverManager.getConnection(url, user, pass);

            String q="insert into student(id,name) values(?,?)";
            PreparedStatement stm=con.prepareStatement(q);
        
          
            Scanner sc=new Scanner(System.in);
            System.out.println("total record");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                
             System.out.println("enter name:");
            String name =sc.nextLine();
              System.out.println("enter id");
            int id =sc.nextInt();
          

            stm.setInt(1,id);
            stm.setString(2, name);
            stm.executeUpdate();
            }
            
            con.close();
            System.out.println("success");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
