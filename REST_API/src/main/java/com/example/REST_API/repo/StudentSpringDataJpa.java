package com.example.REST_API.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.REST_API.entity.Student;

public interface StudentSpringDataJpa extends JpaRepository<Student, Long>{
	
}
