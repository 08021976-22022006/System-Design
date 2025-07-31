package service;

// Business Logic for Students

import java.util.List;

import dao.StudentDAO;
import model.Student;

public class StudentService {
    
    private StudentDAO studentDAO;

    public StudentService() {
        this.studentDAO = new StudentDAO();
    }

    public void addStudent(int id, String name, String rollNo, String department) {
        Student student = new Student(id, name, rollNo, department);
        studentDAO.saveStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentDAO.getAll();
    }

    
}