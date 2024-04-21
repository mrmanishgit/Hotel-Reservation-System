/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection c = DriverManager.getConnection
                                        ("jdbc:oracle:thin:@localhost:1521:orcl","HOTEL","123");
            //Class.forName("com.mysql.jdbc.Driver");  
            //c =DriverManager.getConnection("jdbc:mysql:///hms","root",""); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

