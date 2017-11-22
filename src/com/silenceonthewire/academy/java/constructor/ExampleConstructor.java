package com.silenceonthewire.academy.java.constructor;

public class ExampleConstructor {
	
	private String name;
	
	private String address;
	
	public ExampleConstructor() {
		
	}
	
	public ExampleConstructor(String name) {
		this.name = name;
	}
	
	public ExampleConstructor(String name, String address) {
		this.name = name;
		this.address = address;
	}

}
