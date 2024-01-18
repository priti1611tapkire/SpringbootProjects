package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer> {
	public Employee findAllByUnameAndPass(String uname,String pass);
public Employee findAllByid(int id);
@Query("from Employee")
public List<Employee> getAllRecordofEmployees();
}
