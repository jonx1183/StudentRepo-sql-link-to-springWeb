package com.example.p13102022.Repository;

public class Test {
  public static void main(String[] args) {
    StudentRepo repo = new StudentRepo();

    System.out.println(repo.getAlleStudents());
    System.out.println(repo.getStudent(1));
  }
}
