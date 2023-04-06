package com.shreyash.studentmanagmetsystem.service;

import com.shreyash.studentmanagmetsystem.entity.Student;
import com.shreyash.studentmanagmetsystem.record.NewStudentRequest;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();

    void addStudent(Student student);
}
