package com.example.demo.serviceimpl;

import java.util.List;



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
	@Override
	public List<Customer> getData(String un, String ps) {
		// TODO Auto-generated method stub
		
		if(un.equals("admin")&&ps.equals("admin")) {
			List<Customer> clist=(List<Customer>) hr.findAll();
			return clist;
		}
		
		else {
			List<Customer> slist=hr.findByUnameAndPass(un, ps);
			return slist;
		}
	}
	@Override
	public List<Customer> deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		List<Customer> slist=(List<Customer>) hr.findAll();
		return slist;
	}
	@Override
	public Customer editdata(int id) {
		// TODO Auto-generated method stub
		Customer c=hr.findById(id).get();
		return c;
	}
	@Override
	public List<Customer> updatedata(Customer c) {
		// TODO Auto-generated method stub
		hr.save(c);
		List<Customer> clist=(List<Customer>) hr.findAll();
		return clist;
	}
}
