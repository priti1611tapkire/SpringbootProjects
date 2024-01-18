package com.priti.springweb;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.priti.springweb.entities.Product;
import com.priti.springweb.repos.ProductRepository;


@RunWith(SpringRunner.class)
@WebMvcTest
public class ProductRestControllerMvcTest {
	
	private static final int PRODUCT_ID = 1000;

	private static final String PRODUCT_NAME_STRING ="Its Awesome";

	private static final String PRODUCT_DECRIPTION = "MacBook";

	private static final int PRODUCT_PRICE = 1;

	private static final String CONTEXT_URL = "/productapi";

	private static final String PRODUCTS_URL ="/productapi/products/";

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProductRepository repository;
	
	@Test
	public void test() throws Exception {
		Product product = buildProduct();
		List<Product> products=Arrays.asList(product);
		when(repository.findAll()).thenReturn(products);
		
		ObjectWriter objectWriter=new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		mockMvc.perform(get(PRODUCTS_URL).contextPath(CONTEXT_URL)).andExpect(status().isOk())
		.andExpect( content().json(objectWriter.writeValueAsString(products)));
	}

	private Product buildProduct() {
		Product product=new Product();
		product.setId(PRODUCT_ID);
		product.setName(PRODUCT_NAME_STRING);
		product.setDescription(PRODUCT_DECRIPTION);
		product.setPrice(PRODUCT_PRICE);
		return product;
	}
	
	+
	
	@Test
	private void testCreateProduct() throws  Exception {
		Product product=new Product();
		when(repository.save(any())).thenReturn(product);
		ObjectWriter objectWriter=new ObjectMapper().writer().withDefaultPrettyPrinter();
		mockMvc.perform(post(PRODUCTS_URL).contextPath(CONTEXT_URL).contentType(MediaType.APPLICATION_JSON).content(objectWriter.writeValueAsString(product))).andExpect(status().isOk())
		.andExpect( content().json(objectWriter.writeValueAsString(product)));
	}
	
	
	@Test
	private void testUpdateProduct() throws  Exception {
		Product product=new Product();
		product.setPrice(5000);
		when(repository.save(any())).thenReturn(product);
		ObjectWriter objectWriter=new ObjectMapper().writer().withDefaultPrettyPrinter();
		mockMvc.perform(put(PRODUCTS_URL).contextPath(CONTEXT_URL).contentType(MediaType.APPLICATION_JSON).content(objectWriter.writeValueAsString(product))).andExpect(status().isOk())
		.andExpect( content().json(objectWriter.writeValueAsString(product)));
	}
	
	@Test
	public void deleteProduct() throws Exception {
		doNothing().when(repository).deleteById(PRODUCT_ID);
		mockMvc.perform(delete(PRODUCTS_URL +PRODUCT_ID).contextPath(CONTEXT_URL)).andExpect(status().isOk());
	}
	
	
	
	
	
	

}
