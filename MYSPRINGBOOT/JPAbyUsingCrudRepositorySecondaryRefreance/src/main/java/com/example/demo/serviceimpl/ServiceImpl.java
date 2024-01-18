package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	HomeRepository hr;

	@Override
	public void savaData(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}

	public Employee logincheck(String uname, String pass) {
		return hr.findAllByUnameAndPass(uname, pass);
	}
	public Iterable<Employee> getAllData() {

		return hr.findAll();
	}
	public Employee editdata(int id) {
		
		return	hr.findAllByid(id);
			
		}

	
	@Override
	public void deleteData(Employee e) 
	{
		
	 hr.delete(e);	
	}
	
}
