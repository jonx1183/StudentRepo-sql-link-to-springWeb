package com.example.p13102022.Model;

public class Student {
  private int id;
  private String name;
  private String email;
  private boolean gender;

  public Student(int id, String name, String email, boolean gender){
    this.id = id;
    this.name =name;
    this.email =email;
    this.gender =gender;

  }

  public Student(String name, String email, boolean gender){
    this.name =name;
    this.email =email;
    this.gender =gender;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public boolean isGender() {
    return gender;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", gender=" + gender +
        '}';
  }
}
