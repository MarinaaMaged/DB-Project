/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doe;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author N A N A
 */
public class Tables {
    public static void main (String[] args){
        try{
            Connection con= ConnectionProvider.getCon();
            Statement st = con.createStatement();
           // st.executeUpdate("CREATE TABLE user(user_pk INT AUTO_INCREMENT primary key,userRole varchar(100) NOT NULL,First_Name varchar(50) NOT NULL,Middle_Name varchar(50) NOT NULL,Last_Name varchar(50) NOT NULL, mobileNumber varchar(50) NOT NULL, username varchar(50) NOT NULL,password varchar(50) NOT NULL,Street varchar(50) NOT NULL,Zone varchar(50) NOT NULL,salary INT NOT NULL)");
           // st.executeUpdate("insert into user(user_pk,userRole,First_Name,Middle_Name,Last_Name,mobileNumber,username,password,Street,Zone,salary) values(1,'Admin','Marina','Maged','Magdy','01201776399','marina1','123456','july road','manshya',10000)");
            //st.executeUpdate("CREATE TABLE medicine(medicine_pk int AUTO_INCREMENT primary key,UniqueID varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
          // st.executeUpdate("CREATE TABLE medicine(medicine_pk int AUTO_INCREMENT primary key,UniqueID varchar(200),name varchar(200),DrugManufacture varchar(200),stock bigint,price bigint,drugType varchar(200),ManufactureDate varchar(200),ExpireDate varchar(200))");
            JOptionPane.showMessageDialog(null, "Table created successfuly");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
