package com.example.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class Greeting1Imple1Test {

	private Greeting1 ob;

	@BeforeEach
	public void setup() {
	ob = new Greeting1Imple1(); 
	}
	
	@Test
	void greeting1Imple1MustReturnString() {
		String greet = ob.greet("JUnit");
		assertEquals("JUnit",greet);
		
	}
	
	@Test
	void testingForNullException() {
		Assertions.assertThrows(NullPointerException.class,()->{
			ob.greet(null);
		});
	}

}
