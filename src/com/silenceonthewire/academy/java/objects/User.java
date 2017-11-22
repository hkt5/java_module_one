package com.silenceonthewire.academy.java.objects;

public class User {
	
	public class Validate{
		
		
		
	}
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Validate validate() {
		Validate validate = new Validate();
		return validate;
	}

}
