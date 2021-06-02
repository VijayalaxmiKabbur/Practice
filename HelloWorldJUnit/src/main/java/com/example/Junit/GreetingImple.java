package com.example.Junit;

public class GreetingImple implements Greeting {
	Greeting1 ob;

	@Override
	public String greet(String name) {
		return ob.greet(name);
	}

}
