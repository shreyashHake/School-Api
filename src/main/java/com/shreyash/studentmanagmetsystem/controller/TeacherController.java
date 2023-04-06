package com.shreyash.studentmanagmetsystem.controller;

import com.shreyash.studentmanagmetsystem.entity.Teacher;
import com.shreyash.studentmanagmetsystem.record.NewTeacherRequest;
import com.shreyash.studentmanagmetsystem.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @GetMapping("/get")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @PostMapping("/post")
    public String addTeacher(@RequestBody NewTeacherRequest newTeacherRequest) {
        teacherService.addTeacher(newTeacherRequest);
        return "Teacher added successfully!";
    }
}
