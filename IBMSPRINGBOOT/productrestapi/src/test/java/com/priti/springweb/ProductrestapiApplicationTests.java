package com.priti.springweb;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.priti.springweb.controller.ProductRestController;
import com.priti.springweb.entities.Product;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductrestapiApplicationTests {

	@Value("${productrestapi.services.url}")
	private String baseURL;
	
	
	
	@Test
	public void testGetProduct() {
		System.out.println(baseURL);
		RestTemplate restTemplate=new RestTemplate();
	//	Product product=restTemplate.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		Product product=restTemplate.getForObject(baseURL+"1", Product.class);
		assertNotNull(product);
		assertEquals("IPhone", product.getName());

	}

	@Test
	public void testCreateProduct() {
		RestTemplate restTemplate=new RestTemplate();
		Product product=new Product();
		product.setName("Xaomi");
		product.setDescription("Coool");
		product.setPrice(36000);
//		Product newProduct=restTemplate.postForObject("http://localhost:8080/productapi/products/", product, Product.class);
		Product newProduct=restTemplate.postForObject(baseURL, product, Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		assertEquals("Xaomi", newProduct.getName());
	}

	@Test
	public void testUpadteProduct() {
		RestTemplate restTemplate=new RestTemplate();
		//Product product=restTemplate.getForObject("http://localhost:8080/productapi/products/1", Product.class);
		Product product=restTemplate.getForObject(baseURL + "1", Product.class);
		product.setPrice(380000);
	//	restTemplate.put("http://localhost:8080/productapi/products/", product);
		restTemplate.put(baseURL, product);


	}

}
