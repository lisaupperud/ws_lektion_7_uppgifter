package com.lisa.lektion_7_uppgifter.repository;

import com.lisa.lektion_7_uppgifter.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findById(long id);
    Optional<Student> findByEmail(String email);
}
