package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.homerepository.HomeRepository;
import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;
@Service
public class ServieceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public void saveData(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}


	@Override
	public List<Employee> loginck(String uname, String pass) {
		// TODO Auto-generated method stub
		if(uname.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin")) {
			List<Employee> list=(List<Employee>) hr.findAll();
			return list;
		}
		else {
			List<Employee> list=hr.findByUnameAndPass(uname, pass);
			return list;
		}
		
	}

	@Override
	public List<Employee> deleteData(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		List<Employee> list=(List<Employee>) hr.findAll();
		return (List<Employee>) hr.findAll();
	}


	@Override
	public Employee editData(int id) {
		// TODO Auto-generated method stub
		Employee e=hr.findById(id).get();
		return e;
	}


	@Override
	public List<Employee> updatData(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
		List<Employee> list=(List<Employee>) hr.findAll();
		return list;
	}

}
