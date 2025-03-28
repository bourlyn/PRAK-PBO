package com.university.main;
import com.university.model.Student;

public class Main 
{
    public static void main(String[] args) 
    {
        Student[] students = new Student[3];
        
        students[0] = new Student("S001", "Alice", 20, 3.8);
        students[1] = new Student("S002", "Bob", 22, 3.6);
        students[2] = new Student("S003", "Charlie", 21, 3.9);

        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) 
        {
            System.out.println(
                "ID: " + student.getStudentId() + 
                ", Nama: " + student.getName() + 
                ", Umur: " + student.getAge() + 
                ", GPA: " + student.getGpa());
        }
    }
}