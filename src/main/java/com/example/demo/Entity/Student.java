package com.example.demo.Entity;


import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name="firstName",nullable = false)
    private String FirstName;
    @Column(name="lastName",nullable = false)
    private String LastName;
    @Column(name="email",nullable = false)
    private String email;

    public Student(){

    }

    public Student(String firstName, String lastName, String email) {
        super();
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
