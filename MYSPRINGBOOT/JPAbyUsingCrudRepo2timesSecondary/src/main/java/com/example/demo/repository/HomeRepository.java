package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>  {
	public Employee findAllByUnameAndPass(String un,String ps);
}
