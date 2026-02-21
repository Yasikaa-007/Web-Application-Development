<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Hospital Management System</title> 
<style> 
body { 
    font-family: Arial, sans-serif; 
    background-color: #f2f2f2; 
    text-align: center; 
    margin: 0; 
    padding: 0; 
} 
.header { 
    background-color: #2c3e50; 
    color: white; 
    padding: 20px; 
    font-size: 28px; 
} 
.container { 
    margin-top: 50px; 
} 
a { 
    display: inline-block; 
    width: 220px; 
    padding: 12px; 
    margin: 15px; 
    text-decoration: none; 
    font-size: 18px; 
    color: white; 
    background-color: #3498db; 
    border-radius: 5px; 
    transition: 0.3s; 
} 
a:hover { 
    background-color: #2980b9; 
} 
</style> 
 
</head> 
<body> 
<div class="header"> 
    Hospital Management System 
</div> 
<div class="container"> 
    <a href="addPatient.jsp">Add Patient</a><br> 
    <a href="view.jsp">View Patients</a><br> 
    <a href="search.jsp">Search Patient</a><br> 
</div> 
</body> 
</html>
