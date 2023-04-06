package com.shreyash.studentmanagmetsystem.record;

import com.shreyash.studentmanagmetsystem.entity.Student;

import java.util.Set;

public record NewSubjectRequest(String name, Set<Student> enrolledStudents) {
}
