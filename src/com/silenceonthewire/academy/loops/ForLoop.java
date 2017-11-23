package com.silenceonthewire.academy.loops;

public class ForLoop {

	public static void main(String[] args) {
		deprecatedFor();
		currentFor();
	}
	
	@Deprecated
	public static void deprecatedFor() {
		String currentString = "firstCurrentString";
		System.out.println(currentString);
		char[] currentChar = currentString.toCharArray();
		for (int i = 0; i < currentChar.length; i++){
		    System.out.println(currentChar[i]);
		}
		
	}
	
	public static void currentFor() {
		String currentString = "secondCurrentString";
		System.out.println(currentString);
		char[] currentChar = currentString.toCharArray();
		for (char currentValue: currentChar){
		    System.out.println(currentValue);
		}
		
	}

}
