package com.university.model;

public class Student 
{
    private String studentId;
    private String name;
    protected int age;
    public double gpa;

    public Student(String studentId, String name, int age, double gpa) {
        
        this.studentId = studentId;
        
        this.name = name;
        
        this.age = age;
        
        this.gpa = gpa;
    }

    // Getter methods
    public String getStudentId() { 
        return studentId; 
    }
    public String getName() { 
        return name; 
    }
    public int getAge() { 
        return age; 
    }
    public double getGpa() { 
        return gpa; 
    }

    // Setter methods
    public void setStudentId(String studentId) { 
        this.studentId = studentId; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public void setAge(int age) { 
        this.age = age; 
    }
    public void setGpa(double gpa) { 
        this.gpa = gpa; 
    }
}