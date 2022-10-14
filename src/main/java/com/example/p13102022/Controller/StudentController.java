package com.example.p13102022.Controller;

import com.example.p13102022.Model.Student;
import com.example.p13102022.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

StudentService studentService = new StudentService();

@GetMapping("/")
  public List<Student> index(){
  return studentService.getAllStudents();
}

@GetMapping("/student")
  public Student getStudent(@RequestParam int id){
  return studentService.getStudent(id);
}


}
