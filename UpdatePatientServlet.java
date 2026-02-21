package com.hospital.servlet; 
import java.io.IOException; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import com.hospital.dao.*; 
import com.hospital.model.Patient; 
public class UpdatePatientServlet extends HttpServlet { 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
        int id = Integer.parseInt(request.getParameter("id")); 
        String name = request.getParameter("name"); 
        int age = Integer.parseInt(request.getParameter("age")); 
        String disease = request.getParameter("disease"); 
        String doctor = request.getParameter("doctor"); 
        Patient patient = new Patient(id, name, age, disease, doctor); 
        PatientDAO dao = new PatientDAOImpl(); 
        dao.updatePatient(patient); 
        response.sendRedirect("viewPatients?success=updated"); 
    } 
}
