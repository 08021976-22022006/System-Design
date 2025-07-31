package dao;

// DAO Layer for Students
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAO {
    private List<Student> studentList = new ArrayList<>();
    
    public void saveStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getAll(){
        return studentList;
    }
}
