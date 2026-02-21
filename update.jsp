<%@ include file="DBConnection.jsp" %> 
<% 
int id = Integer.parseInt(request.getParameter("id")); 
 
String name = request.getParameter("name"); 
String age = request.getParameter("age"); 
String disease = request.getParameter("disease"); 
String doctor = request.getParameter("doctor"); 
 
if(name != null){ 
    PreparedStatement ps = con.prepareStatement( 
    "UPDATE patient SET name=?, age=?, disease=?, doctor=? WHERE id=?"); 
 
    ps.setString(1, name); 
    ps.setInt(2, Integer.parseInt(age)); 
    ps.setString(3, disease); 
    ps.setString(4, doctor); 
    ps.setInt(5, id); 
 
    ps.executeUpdate(); 
    response.sendRedirect("view.jsp"); 
} 
 
PreparedStatement ps = con.prepareStatement("SELECT * FROM patient WHERE id=?"); 
ps.setInt(1, id); 
ResultSet rs = ps.executeQuery(); 
rs.next(); 
%> 
 
<form method="post"> 
Name: <input type="text" name="name" value="<%= rs.getString("name") %>"><br> 
Age: <input type="text" name="age" value="<%= rs.getInt("age") %>"><br> 
Disease: <input type="text" name="disease" value="<%= rs.getString("disease") %>"><br> 
Doctor: <input type="text" name="doctor" value="<%= rs.getString("doctor") %>"><br> 
<input type="submit" value="Update"> 
</form> 
