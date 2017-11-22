package com.silenceonthewire.academy.java.adnotations.depreacted;

public class DeprecatedMethodClass {
	
	@Deprecated
	public void printDeprecatedMethodName() {
		System.out.println("printDeprecatedMethodName");
	}
	
	public void printNormalMethodName() {
		System.out.println("printNormalMethodName");
	}

}
