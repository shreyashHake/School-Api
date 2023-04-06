package com.shreyash.studentmanagmetsystem.service;

import com.shreyash.studentmanagmetsystem.entity.Teacher;
import com.shreyash.studentmanagmetsystem.record.NewTeacherRequest;
import com.shreyash.studentmanagmetsystem.repository.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private ITeacherRepo teacherRepo;

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepo.findAll();
    }

    @Override
    public void addTeacher(NewTeacherRequest newTeacherRequest) {
        teacherRepo.save(null);
    }
}
