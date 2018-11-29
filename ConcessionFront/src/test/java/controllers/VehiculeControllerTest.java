package controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class VehiculeControllerTest {

	 
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@BeforeEach
	public void createMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}
	
	
	@Test
	void testGetVehicules() throws Exception {
		mockMvc.perform(get("/vehicules"))
			.andExpect(status().isOk())
			.andExpect(view().name("vehicules"));
	}

}
