package com.shanks.studentportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shanks.studentportal.model.Student;

public interface Studentrepo extends JpaRepository<Student,Integer>{

	Student findByEmail(String email);
}
