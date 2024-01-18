package com.example.demo.homerepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>{
List<Employee> findByUnameAndPass (String uname, String pass);
}
