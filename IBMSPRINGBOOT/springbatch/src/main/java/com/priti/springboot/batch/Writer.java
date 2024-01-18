package com.priti.springboot.batch;

import java.util.List;


import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside writer");
		System.out.println("writing data :" +items);
	}

}
