package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Customer;

public interface ServiceI {

	void saveRecord(Customer c);

	List<Customer> getData(String un, String ps);

	List<Customer> deletedata(int id);

	Customer editdata(int id);

	List<Customer> updatedata(Customer s);

}
