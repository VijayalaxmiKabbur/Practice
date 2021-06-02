package com.example.Junit;

public class Greeting1Imple1 implements Greeting1 {

	@Override
	public String greet(String name) {
		if(name == null)
			throw new NullPointerException();
		return name;
	}

}
