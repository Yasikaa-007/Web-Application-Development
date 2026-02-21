package com.hospital.dao; 
import java.util.List; 
import com.hospital.model.Patient; 
public interface PatientDAO { 
    void addPatient(Patient patient); 
    List<Patient> getAllPatients(); 
    void updatePatient(Patient patient); 
    void deletePatient(int id); 
    List<Patient> searchPatient(String keyword); 
}
