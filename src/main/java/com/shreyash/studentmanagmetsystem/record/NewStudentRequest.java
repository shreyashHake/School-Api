package com.shreyash.studentmanagmetsystem.record;

import com.shreyash.studentmanagmetsystem.entity.Subject;

import java.util.Set;

public record NewStudentRequest(String name, Set<Subject> subjects) {
}
