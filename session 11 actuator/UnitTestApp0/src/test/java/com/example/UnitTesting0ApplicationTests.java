package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.core.controllers.TestController;
import com.core.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
class UnitTesting0ApplicationTests {

	@Test
	void contextLoads() {
	}

	 @Test
	    public void testHomeController() 
	    {
		 TestController hmcontroller = new TestController();
	        String result = hmcontroller.home();
	        assertEquals(result, "Hello duniya!!");
	    }
	 
	 @Test
	    public void testGetUserById() 
	       {
		 TestController contoller = new TestController();
		 Employee emp = contoller.firstPage();
	        assertEquals("1", emp.getEmpId());
	    }
}



