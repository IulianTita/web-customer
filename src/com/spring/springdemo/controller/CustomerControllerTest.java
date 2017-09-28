package com.spring.springdemo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class CustomerControllerTest {
	
	@Test
	public void testCustmorListPage() throws Exception {
		CustomerController controller = new CustomerController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/customer/list")).andExpect(view().name("list-customers"));
	}
}
