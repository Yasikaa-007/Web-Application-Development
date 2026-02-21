package com.hospital.model; 
public class Patient { 
    private int id; 
    private String name; 
    private int age; 
    private String disease; 
    private String doctor; 
    public Patient() {} 
    public Patient(String name, int age, String disease, String doctor) { 
        this.name = name; 
        this.age = age; 
        this.disease = disease; 
        this.doctor = doctor; 
    } 
    public Patient(int id, String name, int age, String disease, String doctor) { 
        this.id = id; 
        this.name = name; 
        this.age = age; 
        this.disease = disease; 
        this.doctor = doctor; 
    } 
    public int getId() { return id; } 
    public void setId(int id) { this.id = id; } 
    public String getName() { return name; } 
    public void setName(String name) { this.name = name; } 
    public int getAge() { return age; } 
    public void setAge(int age) { this.age = age; } 
    public String getDisease() { return disease; } 
    public void setDisease(String disease) { this.disease = disease; } 
    public String getDoctor() { return doctor; } 
    public void setDoctor(String doctor) { this.doctor = doctor; } 
}
