package com.example.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
//@RunWith(JUnitPlatform.class) //to use this we need to add junit-platform-runner and junit-jupiter-api in pom.xml
class GreetingImpleTest {
	
	
	@Mock
	Greeting1 obg;
	
	@InjectMocks
	GreetingImple ob = new GreetingImple();
	@Test
	void greetShouldReturnString() {
		
		
		Mockito.when(obg.greet("JUnit")).thenReturn("JUnit");
		String greet = ob.greet("JUnit");
		assertEquals("JUnit",greet);
		
		
	}

}

