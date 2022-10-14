package com.example.p13102022.Model;

public class Student {
  private int id1;
  private String name1;
  private String email;
  private boolean gender;

  public Student(int id, String name, String email, boolean gender){
    this.id1 = id;
    this.name1 =name;
    this.email =email;
    this.gender =gender;

  }

  public Student(String name, String email, boolean gender){
    this.name1 =name;
    this.email =email;
    this.gender =gender;
  }

  public int getId1() {
    return id1;
  }

  public String getName1() {
    return name1;
  }

  public String getEmail() {
    return email;
  }

  public boolean isGender() {
    return gender;
  }

  public void setId1(int id1) {
    this.id1 = id1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
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
        "id=" + id1 +
        ", name='" + name1 + '\'' +
        ", email='" + email + '\'' +
        ", gender=" + gender +
        '}';
  }
}
