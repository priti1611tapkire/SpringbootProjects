package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
@Repository
public interface HomeRepository extends CrudRepository<Customer, Integer> {

	

}
