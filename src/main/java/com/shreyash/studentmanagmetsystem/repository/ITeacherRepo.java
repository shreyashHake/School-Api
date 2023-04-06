package com.shreyash.studentmanagmetsystem.repository;

import com.shreyash.studentmanagmetsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepo extends JpaRepository<Teacher, Integer> {
}
