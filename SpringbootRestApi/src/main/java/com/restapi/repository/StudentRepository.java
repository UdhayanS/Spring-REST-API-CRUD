package com.restapi.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
