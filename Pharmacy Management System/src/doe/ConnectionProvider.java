/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doe;
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author N A N A
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lastone?useSSL=false","root","#Verna2008");
            return con;
            
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
