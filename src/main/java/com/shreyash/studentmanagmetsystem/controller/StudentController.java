package com.shreyash.studentmanagmetsystem.controller;

import com.shreyash.studentmanagmetsystem.entity.Student;
import com.shreyash.studentmanagmetsystem.record.NewStudentRequest;
import com.shreyash.studentmanagmetsystem.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/get")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/post")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added";
    }
}
