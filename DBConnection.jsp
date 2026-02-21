<%@ page import="java.sql.*" %> 
<% 
String url = "jdbc:mysql://localhost:3306/hospital_db"; 
String user = "root"; 
String password = "root"; 
Connection con = null; 
try { 
    Class.forName("com.mysql.cj.jdbc.Driver"); 
    con = DriverManager.getConnection(url, user, password); 
} catch(Exception e) { 
    out.println(e); 
} 
%>
