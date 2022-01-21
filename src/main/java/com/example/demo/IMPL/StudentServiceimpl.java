package com.example.demo.IMPL;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import com.example.demo.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.FindAll();
    }
}
