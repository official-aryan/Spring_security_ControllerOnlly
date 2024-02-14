package com.SpringSecurity.SpringSecurity.Repository;

import com.SpringSecurity.SpringSecurity.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
