package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface HomeRepository extends CrudRepository<Customer, Integer> {

	public List<Customer> findByUnameAndPass(String uname,String pass);

}
