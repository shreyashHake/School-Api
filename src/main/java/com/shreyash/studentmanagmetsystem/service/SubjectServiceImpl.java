package com.shreyash.studentmanagmetsystem.service;

import com.shreyash.studentmanagmetsystem.entity.Student;
import com.shreyash.studentmanagmetsystem.entity.Subject;
import com.shreyash.studentmanagmetsystem.repository.IStudentRepo;
import com.shreyash.studentmanagmetsystem.repository.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements ISubjectService {

    @Autowired
    private ISubjectRepo subjectRepo;

    @Autowired
    private IStudentRepo studentRepo;

    @Override
    public List<Subject> getAllSubject() {
        return subjectRepo.findAll();
    }

    @Override
    public void addSubject(Subject subject) {
        subjectRepo.save(subject);
    }

    @Override
    public void addStudent(Long subjectId, Long studentId) {

        Subject subject = subjectRepo.findById(subjectId).get();
        Student student = studentRepo.findById(studentId).get();

        subject.getEnrolledStudents().add(student);
    }
}
