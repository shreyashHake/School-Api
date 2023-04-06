package com.shreyash.studentmanagmetsystem.service;

import com.shreyash.studentmanagmetsystem.entity.Teacher;
import com.shreyash.studentmanagmetsystem.record.NewTeacherRequest;

import java.util.List;

public interface ITeacherService {
    List<Teacher> getAllTeacher();

    void addTeacher(NewTeacherRequest newTeacherRequest);
}
