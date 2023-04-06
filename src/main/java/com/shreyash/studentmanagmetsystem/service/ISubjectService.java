package com.shreyash.studentmanagmetsystem.service;

import com.shreyash.studentmanagmetsystem.entity.Subject;

import java.util.List;

public interface ISubjectService {
    List<Subject> getAllSubject();

    void addSubject(Subject subject);

    void addStudent(Long subjectId, Long studentId);
}
