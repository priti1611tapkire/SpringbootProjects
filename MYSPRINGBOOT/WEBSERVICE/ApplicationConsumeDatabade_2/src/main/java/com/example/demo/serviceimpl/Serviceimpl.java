package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;
@Service
public class Serviceimpl implements ServiceI {

@Autowired
HomeRepository hr;
	@Override
	
	public void saveRecord(Customer c) {
		// TODO Auto-generated method stub
		hr.save(c);
	}

}
