package com.example.demo.serviceimpl;

import java.util.List;


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

	public List<Employee> getData(String uname, String pass){
		if(uname.equals("admin")&& pass.equals("admin")) {
			List<Employee> elist=(List<Employee>) hr.findAll();
			return elist;
		}
		else {
			List<Employee> elist= (List<Employee>) hr.findAllByUnameAndPass(uname, pass);
			return elist;
		}

	}

	public List<Employee> deleteRecord(int id) {
		// TODO Auto-generated method stub
		
           hr.deleteById(id);
		//List<Employee> slist=(List<Employee>) hr.findAll();

		return (List<Employee>) hr.findAll();
	}


	@Override
	public Employee editRecord(int id) {
		// TODO Auto-generated method stub
		return hr.findById(id).get();
	}


	@Override
	public List<Employee> updateRecord(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
		System.out.println(e);

		//List<Employee> elist=(List<Employee>) hr.findAll();
		return (List<Employee>) hr.findAll();

	}
	
	public List<Employee> getallData(){
		return hr.getAllRecordofEmployees();
	}
	
	
}
