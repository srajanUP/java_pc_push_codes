package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {

        //loading the  MySql driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
        } catch (Exception e) {
            System.out.println(e);
        }

        //creating the connection
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jaavbook", "root", "Upsrajan@251");


            //cerating the statements
            PreparedStatement ps = con.prepareStatement("insert into student (ssn,mi,lastname,birthDate,street,phone,zipcode,deptId,firstname)  values ('3','B','raj','2001-08-01','kamla nagar','8077262255','40032','CH','Akash')");
            int rs=ps.executeUpdate();

            if (rs>0){
                System.out.println("data updated successfully");
            }
            else{
                System.out.println("unsuccessful");
            }
            //closing the connection

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }



        
    }
    
}
