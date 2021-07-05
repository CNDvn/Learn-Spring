package com.cndvn.managementstudent.service;

import com.cndvn.managementstudent.entity.StudentEntity;
import com.cndvn.managementstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    public List<StudentEntity> getStudents();
}
