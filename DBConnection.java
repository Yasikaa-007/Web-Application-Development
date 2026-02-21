
package com.hospital.util; 
 
import java.sql.Connection; 
import java.sql.DriverManager; 
public class DBConnection { 
    public static Connection getConnection() { 
        Connection conn = null; 
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
 
            conn = DriverManager.getConnection( 
                    "jdbc:mysql://localhost:3306/hospital_db", 
                    "root", 
                    "your_password"); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return conn; 
    } 
} 
