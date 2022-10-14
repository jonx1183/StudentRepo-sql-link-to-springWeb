package com.example.p13102022.Service;

import com.example.p13102022.Model.Student;
import com.example.p13102022.Repository.StudentRepo;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class StudentService {

  StudentRepo repo = new StudentRepo();

  public List<Student> getAllStudents(){
    return repo.getAlleStudents();
  }

  public Student getStudent(int id){
    return repo.getStudent(id);
  }

  public void create(WebRequest req){
    boolean gender = false;

    if(req.getParameter("gender") =="Mand"){
      gender = true;

    }
    Student student = new Student(req.getParameter("name"),req.getParameter("email"),gender);

    repo.createStudent(student);
  }
}
