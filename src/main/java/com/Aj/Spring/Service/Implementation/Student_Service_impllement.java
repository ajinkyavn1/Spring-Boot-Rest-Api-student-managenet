package com.Aj.Spring.Service.Implementation;

import com.Aj.Spring.Model.Student;
import com.Aj.Spring.Repository.StudentRepo;
import com.Aj.Spring.Service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service_impllement implements Student_Service {
    @Autowired
    StudentRepo studentRepo;


    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }
}
