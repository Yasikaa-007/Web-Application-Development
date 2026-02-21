<%@ include file="DBConnection.jsp" %> 
<form method="get"> 
Search Name: <input type="text" name="name"> 
<input type="submit" value="Search"> 
</form> 
<table border="1"> 
<tr> 
<th>ID</th> 
<th>Name</th> 
<th>Age</th> 
<th>Disease</th> 
<th>Doctor</th> 
</tr> 
<% 
String name = request.getParameter("name"); 
if(name != null){ 
PreparedStatement ps = con.prepareStatement( 
"SELECT * FROM patient WHERE name LIKE ?"); 
ps.setString(1, "%"+name+"%"); 
ResultSet rs = ps.executeQuery(); 
while(rs.next()){ 
%> 
<tr> 
<td><%= rs.getInt("id") %></td> 
<td><%= rs.getString("name") %></td> 
<td><%= rs.getInt("age") %></td> 
<td><%= rs.getString("disease") %></td> 
<td><%= rs.getString("doctor") %></td> 
</tr> 
<% } } %> 
</table> 
