package com.hospital.servlet; 
import java.io.IOException; 
import java.util.List; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import com.hospital.dao.*; 
import com.hospital.model.Patient; 
public class SearchPatientServlet extends HttpServlet { 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
        String keyword = request.getParameter("keyword"); 
        PatientDAO dao = new PatientDAOImpl(); 
        List<Patient> list = dao.searchPatient(keyword); 
        request.setAttribute("list", list); 
        RequestDispatcher rd = request.getRequestDispatcher("view/view_patients.jsp"); 
        rd.forward(request, response); 
    } 
} 
