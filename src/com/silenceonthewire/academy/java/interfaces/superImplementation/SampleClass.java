package com.silenceonthewire.academy.java.interfaces.superImplementation;

public class SampleClass implements FirstInterface, SecondInterface {

	@Override
	public void sampleMethod() {
		
		FirstInterface.super.sampleMethod();
		
	}

}
