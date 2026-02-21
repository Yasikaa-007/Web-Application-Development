<%@ include file="DBConnection.jsp" %> 
<% 
String name = request.getParameter("name"); 
String age = request.getParameter("age"); 
String disease = request.getParameter("disease"); 
String doctor = request.getParameter("doctor"); 
if(name != null){ 
    PreparedStatement ps = con.prepareStatement( 
    "INSERT INTO patient(name, age, disease, doctor) VALUES(?,?,?,?)"); 
 
    ps.setString(1, name); 
    ps.setInt(2, Integer.parseInt(age)); 
    ps.setString(3, disease); 
    ps.setString(4, doctor); 
    ps.executeUpdate(); 
    out.println("Patient Added Successfully!"); 
} 
%> 
<form method="post"> 
Name: <input type="text" name="name"><br> 
Age: <input type="text" name="age"><br> 
Disease: <input type="text" name="disease"><br> 
Doctor: <input type="text" name="doctor"><br> 
<input type="submit" value="Add Patient"> 
</form> 
