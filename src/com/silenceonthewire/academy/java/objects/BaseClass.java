package com.silenceonthewire.academy.java.objects;

abstract class BaseClass {
	
	public String getNull() {
		throw new NullPointerException();
	}
	
	abstract void setName();

}
