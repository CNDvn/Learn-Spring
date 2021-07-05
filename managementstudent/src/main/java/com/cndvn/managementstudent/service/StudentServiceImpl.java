package com.cndvn.managementstudent.service;

import com.cndvn.managementstudent.entity.StudentEntity;
import com.cndvn.managementstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }
}
