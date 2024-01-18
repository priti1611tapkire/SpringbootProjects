package com.bharat.springdatajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
