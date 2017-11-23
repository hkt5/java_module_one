package com.silenceonthewire.academy.statements;

public class SwitchExamples {
	
	public String simpleSwitch(String currentString) {
		switch(currentString) {
			case "currentString":
				return currentString;
			case "otherString":
				return null;
			default:
				return null;
		}
	}
	
	public String multipleCasesWithOneValue(String currentString) {
		switch(currentString) {
			case "currentString":
			case "otherString":
				return currentString;
			default:
				return null;
		}
	}

}
