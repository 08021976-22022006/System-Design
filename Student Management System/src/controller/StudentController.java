package controller;


// Presentation Layer (Controller)

import java.util.List;
import model.Student;
import service.StudentService;

public class StudentController {
    private StudentService studentService;

    public StudentController() {
        this.studentService = new StudentService();
    }

    public void createStudent(int id, String name, String rollNo, String department) {
        studentService.addStudent(id, name, rollNo, department);
        System.out.println("Student created successfully!");
    }

    public void displayAllStudents() {
        List<Student> students = studentService.getAllStudents();
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.createStudent(117, "Poova", "23CS114", "CSE");
        controller.displayAllStudents();
    }

}
