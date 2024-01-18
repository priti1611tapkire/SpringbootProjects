package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public List<Student> getData(String un, String ps) {
		// TODO Auto-generated method stub
		
		if(un.equals("admin")&&ps.equals("admin")) {
			List<Student> slist=(List<Student>) hr.findAll();
			return slist;
		}
		
		else {
			List<Student> slist=hr.findByUnameAndPass(un, ps);
			return slist;
		}
	}

	@Override
	public List<Student> deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		List<Student> slist=(List<Student>) hr.findAll();
		return slist;
	}

	@Override
	public List<Student> updatedata(int id, Student s) {
		// TODO Auto-generated method stub
		Student s1=hr.findById(id).get();
		if(s.getId()==s1.getId()) {
			hr.save(s);
		}
		return (List<Student>) hr.findAll();
	}

	@Override
	public Student editdata(int id) {
		// TODO Auto-generated method stub
		Student s=hr.findById(id).get();
		return s;
	}


	

	
	
	
}
