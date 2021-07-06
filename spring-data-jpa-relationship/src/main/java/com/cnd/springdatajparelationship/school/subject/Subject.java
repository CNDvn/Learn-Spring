package com.cnd.springdatajparelationship.school.subject;

import com.cnd.springdatajparelationship.school.student.Student;
import com.cnd.springdatajparelationship.school.teacher.Teacher;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "student_enrolled",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> enrolledStudent = new HashSet<>();

    @ManyToOne
    private Teacher teacher;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getEnrolledStudent() {
        return enrolledStudent;
    }

    public void enrollStudent(Student student) {
        enrolledStudent.add(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
