package com.silenceonthewire.academy.strings;

public class StringsEquals {

	public static void main(String[] args) {
		System.out.println(String.valueOf(goodEquals()));
		System.out.println(String.valueOf(badEquals()));
		System.out.println(String.valueOf(equalsExample()));
	}
	
	public static boolean goodEquals() {
		String firstString = "string";
		String secondString = "string";
		return firstString == secondString;
	}
	
	public static boolean badEquals() {
		String firstString = "string";
		String secondString = new String("string");
		return firstString == secondString;
	}
	
	public static boolean equalsExample() {
		String firstString = "string";
		String secondString = new String("string");
		return firstString.equals(secondString);
	}

}
