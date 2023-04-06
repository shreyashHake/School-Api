package com.shreyash.studentmanagmetsystem.controller;

import com.shreyash.studentmanagmetsystem.entity.Student;
import com.shreyash.studentmanagmetsystem.entity.Subject;
import com.shreyash.studentmanagmetsystem.record.NewSubjectRequest;
import com.shreyash.studentmanagmetsystem.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/subject")
public class SubjectController {
    @Autowired
    private ISubjectService subjectService;

    @GetMapping("/get")
    public List<Subject> getAllSubject() {
        return subjectService.getAllSubject();
    }

    @PostMapping("/post")
    public String addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);
        return "Subject Added Successfully!";
    }

    @PutMapping("/{subject_id}/subject/{student_id}")
    public String  student(
            @PathVariable(name = "subject_id") Long subjectId,
            @PathVariable(name = "student_id") Long studentId
    ) {
        subjectService.addStudent(subjectId, studentId);
        return "Subjcet Added";
    }
}
