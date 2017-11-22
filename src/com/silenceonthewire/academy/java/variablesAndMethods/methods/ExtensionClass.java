package com.silenceonthewire.academy.java.variablesAndMethods.methods;

public class ExtensionClass extends BaseClass {

	@Override
	public String baseMethod() {
		return "welcome";
	}
	
	public String baseMethod(String name) {
		return name;
	}
	
}
