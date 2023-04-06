package com.shreyash.studentmanagmetsystem.repository;

import com.shreyash.studentmanagmetsystem.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepo extends JpaRepository<Subject, Long> {
}
