package com.hospital.servlet; 
import java.io.IOException; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import com.hospital.dao.PatientDAO; 
import com.hospital.dao.PatientDAOImpl; 
import com.hospital.model.Patient; 
public class AddPatientServlet extends HttpServlet { 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
        String name = request.getParameter("name"); 
        int age = Integer.parseInt(request.getParameter("age")); 
        String disease = request.getParameter("disease"); 
        String doctor = request.getParameter("doctor"); 
        Patient patient = new Patient(name, age, disease, doctor); 
        PatientDAO dao = new PatientDAOImpl(); 
        dao.addPatient(patient); 
        response.sendRedirect("viewPatients?success=added"); 
    } 
}
