package com.hospital.dao; 
import java.sql.*; 
import java.util.*; 
import com.hospital.model.Patient; 
import com.hospital.util.DBConnection; 
public class PatientDAOImpl implements PatientDAO { 
    Connection conn = DBConnection.getConnection(); 
    @Override 
    public void addPatient(Patient p) { 
        try { 
            String sql = "INSERT INTO patient(name,age,disease,doctor) VALUES(?,?,?,?)"; 
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, p.getName()); 
            ps.setInt(2, p.getAge()); 
            ps.setString(3, p.getDisease()); 
            ps.setString(4, p.getDoctor()); 
            ps.executeUpdate(); 
        } catch(Exception e) { e.printStackTrace(); } 
    } 
    @Override 
    public List<Patient> getAllPatients() { 
        List<Patient> list = new ArrayList<>(); 
        try { 
            String sql = "SELECT * FROM patient"; 
            PreparedStatement ps = conn.prepareStatement(sql); 
            ResultSet rs = ps.executeQuery(); 
 
            while(rs.next()) { 
                list.add(new Patient( 
                        rs.getInt("id"), 
                        rs.getString("name"), 
                        rs.getInt("age"), 
                        rs.getString("disease"), 
                        rs.getString("doctor"))); 
            } 
        } catch(Exception e) { e.printStackTrace(); } 
 
        return list; 
    } 
    @Override 
    public void updatePatient(Patient p) { 
        try { 
            String sql = "UPDATE patient SET name=?, age=?, disease=?, doctor=? WHERE id=?"; 
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, p.getName()); 
            ps.setInt(2, p.getAge()); 
            ps.setString(3, p.getDisease()); 
            ps.setString(4, p.getDoctor()); 
            ps.setInt(5, p.getId()); 
            ps.executeUpdate(); 
        } catch(Exception e) { e.printStackTrace(); } 
    } 
    @Override 
    public void deletePatient(int id) { 
        try { 
            String sql = "DELETE FROM patient WHERE id=?"; 
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setInt(1, id); 
            ps.executeUpdate(); 
        } catch(Exception e) { e.printStackTrace(); } 
    } 
    @Override 
    public List<Patient> searchPatient(String keyword) { 
        List<Patient> list = new ArrayList<>(); 
        try { 
            String sql = "SELECT * FROM patient WHERE name LIKE ? OR doctor LIKE ?"; 
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, "%" + keyword + "%"); 
            ps.setString(2, "%" + keyword + "%"); 
            ResultSet rs = ps.executeQuery(); 
            while(rs.next()) { 
                list.add(new Patient( 
                        rs.getInt("id"), 
                        rs.getString("name"), 
                        rs.getInt("age"), 
                        rs.getString("disease"), 
                        rs.getString("doctor"))); 
            } 
        } catch(Exception e) { e.printStackTrace(); } 
        return list; 
    } 
} 
