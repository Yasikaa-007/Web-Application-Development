package com.hospital.servlet; 
 
import java.io.IOException; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import com.hospital.dao.*; 
public class DeletePatientServlet extends HttpServlet { 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
        int id = Integer.parseInt(request.getParameter("id")); 
        PatientDAO dao = new PatientDAOImpl(); 
        dao.deletePatient(id); 
        response.sendRedirect("viewPatients?success=deleted"); 
    } 
}
