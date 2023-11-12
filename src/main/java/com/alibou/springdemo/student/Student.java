package com.alibou.springdemo.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {

  @Id
  @GeneratedValue
  private Integer id;

  private String firstname;

  private String lastname;

  private LocalDate dateOfBirth;

  @Column(unique = true)
  private String email;

  @Transient
  private int age;

  public Student(
      String firstname,
      String lastname,
      LocalDate dateOfBirth,
      String email,
      int age
  ) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.dateOfBirth = dateOfBirth;
    this.email = email;
    this.age = age;
  }

  public Student() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }

  public void setAge(int age) {
    this.age = age;
  }
}
