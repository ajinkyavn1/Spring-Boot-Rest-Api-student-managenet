package com.Aj.Spring.Service;

import com.Aj.Spring.Model.Student;

import java.util.List;

public interface Student_Service {
    Student save(Student student);
    void DeleteStudent(long id);
    List<Student> getAllStudent();
}
