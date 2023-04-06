package com.shreyash.studentmanagmetsystem.repository;

import com.shreyash.studentmanagmetsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student, Long> {
}
