package com.bharat.springdatajpa;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharat.springdatajpa.entities.Student;
import com.bharat.springdatajpa.repo.StudentRepository;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringdatajpaApplicationTests { 
	
	@Autowired
	private StudentRepository repository;

	@Test
	public void testSaveRepository() {
		Student student=new Student();
		student.setId(11l);
		student.setName("PRITI");
		student.setTestScore(89);
		repository.save(student);
		
		Student savedStudent= repository.findById(11l).get();
		assertNotNull(savedStudent);
		
		
		
	}

}
