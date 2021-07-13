package com.Aj.Spring.Controllar;

import com.Aj.Spring.Model.Student;
import com.Aj.Spring.Service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/register")
public class StudentApi {
    @Autowired
    Student_Service studentService;
    @PostMapping
    ResponseEntity<Student> insert_Data(Student student){
        return  new ResponseEntity<Student>(studentService.save(student), HttpStatus.CREATED);
    }

}
