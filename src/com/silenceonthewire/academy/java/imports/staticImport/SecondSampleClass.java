package com.silenceonthewire.academy.java.imports.staticImport;

public class SecondSampleClass {
	
	String readElement;
	
	public void readAndWrite() {
		this.readElement = FirstSampleClass.read();
		this.write();
	}
	
	public void write() {
		
	}
	
}
