<%@ include file="DBConnection.jsp" %> 
<% 
int id = Integer.parseInt(request.getParameter("id")); 
PreparedStatement ps = con.prepareStatement( 
"DELETE FROM patient WHERE id=?"); 
ps.setInt(1, id); 
ps.executeUpdate(); 
response.sendRedirect("view.jsp"); 
%>
