package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HomeRepository;

@Service
public class ServiceImpl {

	@Autowired
	HomeRepository hr;
	
}
