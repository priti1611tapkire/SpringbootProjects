package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	public List<Student> getData(String uname, String pass){
		if(uname.equals("admin")&& pass.equals("admin")) {
			List<Student> slist=hr.getAllRecordofStudents();
			return slist;
		}
		else {
		//	List<Student> slist=hr.findByUnameAndPass(uname, pass);
			List<Student> slist=hr.getDataByUnameAndPass(uname, pass);
			return slist;
		}
	}
	public List<Student> deleteRecord(int id) {

		//hr.deleteById(id);
		hr.deleteRecords(id);
		
		//List<Student> slist=(List<Student>) hr.findAll();
		//return hr.getAllRecordofStudents();
		return (List<Student>) hr.findAll();
	}
	@Override
	public Student editRecord(int sid) {
		return hr.findById(sid).get();
	}



	public List<Student> updateReco(int id, String mobno, String name, String uname, String pass) {
//		hr.save(e);
//		System.out.println(e);
		hr.update(id, mobno, name, uname, pass);
		return (List<Student>) hr.findAll();
		
		//return hr.getAllRecordofStudents();
	}
//	public List<Student> updateRecord(Student e) {
//		hr.save(e);
//		System.out.println(e);
//		
//		List<Student> slist=(List<Student>) hr.findAll();
//		return slist;
//		//return hr.getAllRecordofStudents();
//	}

	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		List<Student> slist=(List<Student>) hr.findAll();
		return (List<Student>) hr.findAll();
		
	}

}
