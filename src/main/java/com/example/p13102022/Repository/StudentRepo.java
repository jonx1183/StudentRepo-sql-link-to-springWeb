package com.example.p13102022.Repository;

import com.example.p13102022.Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
  private Connection conn = DBConnectionManeger.getConnection();

  public List<Student> getAlleStudents(){
    List<Student> students = new ArrayList<>();

    try{
      PreparedStatement psts = conn.prepareStatement("select * from kea.student1");
      ResultSet rSet = psts.executeQuery();

      while (rSet.next()){
        students.add(new Student(
            rSet.getInt("id"),
            rSet.getString("name"),
            rSet.getString("email"),
            rSet.getBoolean("gender")));
      }

    }catch (SQLException e){
      System.out.println("Error at getAllStudents");

    }
    return students;
  }

  public Student getStudent(int id){
    try{
      PreparedStatement psts = conn.prepareStatement("select * from kea.student1 where id = ?");
      psts.setInt(1, id);
      ResultSet rSet = psts.executeQuery();
    }catch (SQLException e){
      System.out.println("Error at getStudent");
      e.printStackTrace();

    }
    return null;
  }
}
