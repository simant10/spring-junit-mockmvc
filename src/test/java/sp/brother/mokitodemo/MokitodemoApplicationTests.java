package sp.brother.mokitodemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sp.brother.mokitodemo.model.Response;
import sp.brother.mokitodemo.model.Student;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;




//@RunWith(SpringRunner.class)
@SpringBootTest
class MokitodemoApplicationTests {

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;
	ObjectMapper mapper = new ObjectMapper();
	@BeforeEach
	public  void setup() {
		mockMvc =MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void saveStudent() throws Exception {
		Student student = new Student();
		student.setName("Simant");
		student.setEmail("simant@gmail.com");
		student.setMobile(678910);
		student.setStatus(1);
		String jsonRequest= mapper.writeValueAsString(student);
		MvcResult result = mockMvc.perform(
											post("/student/save").
											content(jsonRequest).
											contentType(MediaType.APPLICATION_JSON_VALUE))
											.andExpect(status().isOk()).andReturn();
		//String resultContent = result.getResponse().getContentAsString();
		int resultContent = result.getResponse().getStatus();
		System.out.println("Hello simant Output = "+ resultContent);
		//Response response = mapper.readValue(resultContent, Response.class);
		//Assert.isTrue(response.isStatus() == Boolean.TRUE);
		
							
	}
	@Test
	public void getStudentList() throws Exception {
		MvcResult result = mockMvc
				.perform(get("/student/studentlist").content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		int resultContent = result.getResponse().getStatus();
		Assert.isTrue(resultContent == 200);
	}
	
	

}
