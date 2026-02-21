<%@ include file="DBConnection.jsp" %> 
<table border="1"> 
<tr> 
<th>ID</th> 
<th>Name</th> 
<th>Age</th> 
<th>Disease</th> 
<th>Doctor</th> 
<th>Action</th> 
</tr> 
<% 
Statement st = con.createStatement(); 
ResultSet rs = st.executeQuery("SELECT * FROM patient"); 
while(rs.next()){ 
%> 
<tr> 
<td><%= rs.getInt("id") %></td> 
<td><%= rs.getString("name") %></td> 
<td><%= rs.getInt("age") %></td> 
<td><%= rs.getString("disease") %></td> 
<td><%= rs.getString("doctor") %></td> 
<td> 
<a href="update.jsp?id=<%= rs.getInt("id") %>">Edit</a> 
<a href="delete.jsp?id=<%= rs.getInt("id") %>">Delete</a> 
</td> 
</tr> 
<% } %> 
</table> 
