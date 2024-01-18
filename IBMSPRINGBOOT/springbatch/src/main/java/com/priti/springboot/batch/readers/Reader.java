package com.priti.springboot.batch.readers;

import java.io.Serializable;


import javax.batch.api.chunk.ItemReader;

import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements org.springframework.batch.item.ItemReader<String> {

	private String[] courses= {"python", "salesforce", "Angular"};
	private int count;
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		System.out.println("inside read method");
		if(count<courses.length) {
			return courses[count++];
		}
		else {
			count=0;
		}
		return null;
	}


}
