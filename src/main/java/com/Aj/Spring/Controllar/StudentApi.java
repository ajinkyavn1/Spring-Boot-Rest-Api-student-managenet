package com.Aj.Spring.Controllar;

import com.Aj.Spring.Model.Student;
import com.Aj.Spring.Service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student/")
public class StudentApi {
    @Autowired
    Student_Service studentService;
    @PostMapping("/register")
    ResponseEntity<Student> insert_Data(@RequestBody  Student student){
        return  new ResponseEntity<Student>(studentService.save(student), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    ResponseEntity<String> DeleteStudent(@PathVariable long id){
        studentService.DeleteStudent(id);
        return new ResponseEntity<String>("Deleted Sucessfully",HttpStatus.OK);
    }
    @GetMapping("/getAllStudent")
        List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
}
