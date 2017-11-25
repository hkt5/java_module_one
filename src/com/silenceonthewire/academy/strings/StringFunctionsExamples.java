package com.silenceonthewire.academy.strings;

public class StringFunctionsExamples {

	public static void main(String[] args) {
		
		System.out.println("Wycinamy spacje z łańcucha \"       Sample String \": " + trimFunctionExample() + "\n");
		
		System.out.println("Zmieniamy wszystkie litery w ciągu znaków \"Sample string\" na duże litery: " + toUpperCaseFunctionExample() + "\n");

		System.out.println("Zmieniamy wszystkie litery w ciągu znaków \"Sample string\" na małe litery: " + toLowerCaseFunctionExample() + "\n");
		
		System.out.println("Sprawdzamy, czy pusty ciąg znaków jest rzeczywiście pusty: " + isEmptyFunctionForEmptyStringExample() + "\n");
		
		System.out.println("Sprawdzamy, czy nie pusty ciąg znaków jest rzeczywiście nie pusty: " + isEmptyFunctionForNotEmptyStringExample() + "\n");
		
		System.out.println("Zwracamy długość ciągu znaków \"Sample String\": " + lengthFunctionExample() + "\n");
		
		System.out.println("Zwracamy pierwszy znak ciągu \"Sample String\": " + charAtFunctionExample(0) + "\n");
		
		System.out.println("Zwracamy tablicę znaków z ciągu \"Sample String\":");
		char[] charArray = toCharArrayFunctionExample();
		for(char currentChar: charArray) {
			System.out.println(currentChar);
		}
		System.out.println("\n");
		
		System.out.println("Zwracamy ciąg \"String\" z ciągu \"Sample String\": " + substringFunctionOnlyBeginIndexExample(7) + "\n");
		
		System.out.println("Zwracamy ciąg \"Sam\" z ciągu \"Sample String\" za pomocą funkcji substring: " + substringFunctionBeginIndexAndEndIndexExample(0, 3) + "\n");
		
		System.out.println("Zwracamy ciąg \"Sam\" z ciągu \"Sample String\" za pomocą funkcji subSequence: " + subSequenceFunctionBeginIndexAndEndIndexExample(0, 3) + "\n");
		
		System.out.println("Zwracamy tablicę po wykonaniu funkcji split na znaku \" \": " + "\n");
		for(String currentString: splitFunctionExample()) {
			System.out.println(currentString);
		}
		System.out.println("\n");
		
		System.out.println("Zmieniamy ciąg \"Sample String\" na ciąg \"Sample Java\": " + replaceFunctionExample("String", "Java") + "\n");
		
		System.out.println("Sprawdzamy, czy ciąg znaków \"Sample String\" rzeczywiście zawiera ciąg \"Sample String\": " + matchesFunctionExample("Sample String") + "\n");
		
		System.out.println("Wyszukujemy w ciągu znaków \"Sample String\" pozycję rozpoczynającą ciąg znaków \"Str\": " + indexOfFunctionExample("Str") + "\n");
		
		System.out.println("Porównujemy dwa ciągi znaków \"Sample String\" i \"Sample String\": " + equalsMethodExample() + "\n");
		
		System.out.println("Łączymy ze sobą dwa ciągi znaków \"Sample String\" oraz \" for this book.\": " + concatFunctionExample() + "\n");
		
		System.out.println("Sprawdzamy, czy ciąg znaków \"Sample String\" zaczyna się od ciągu znaków \"Sample\": " + startsWithFunctionExample() + "\n");
		
		System.out.println("Sprawdzamy, czy ciąg znaków \"Sample String\" kończy się od ciągu znaków \"String\": " + endsWithFunctionExample() + "\n");
		
		System.out.println("Sprawdzamy, czy ciąg znaków \"Sample String\" zawiera ciąg znaków \"String\": " + containsFunctionExample() + "\n");
		
		System.out.println("Porownujemy dwa identyczne ciągi znaków \"Sample String\": " + compareToFunctionExample() + "\n");
		
		System.out.println("Zmieniamy ciąg znaków \"Sample String\" na tablicę bajtów: " + "\n");
		for(byte currentByte: getBytesFunctionExample()) {
			System.out.println(currentByte);
		}
	}
	
	public static String trimFunctionExample() {
		String stringToTrim = "       Sample String ";
		return stringToTrim.trim();
	}
	
	public static String toUpperCaseFunctionExample() {
		String stringToUpperCase = "Sample String";
		return stringToUpperCase.toUpperCase();
	}
	
	public static String toLowerCaseFunctionExample() {
		String toLoweCaseString = "Sample String";
		return toLoweCaseString.toLowerCase();
	}
	
	public static String isEmptyFunctionForEmptyStringExample() {
		String emptyString = "";
		return String.valueOf(emptyString.isEmpty());
	}
	
	public static String isEmptyFunctionForNotEmptyStringExample() {
		String notEmptyString = "Sample String";
		return String.valueOf(notEmptyString.isEmpty());
	}
	
	public static int lengthFunctionExample() {
		String stringToLength = "Sample String";
		return stringToLength.length();
	}
	
	public static char charAtFunctionExample(int index) {
		String stringToCharAt = "Sample String";
		return stringToCharAt.charAt(index);
	}
	
	public static char[] toCharArrayFunctionExample() {
		String stringToCharArray = "Sample String";
		return stringToCharArray.toCharArray();
	}
	
	public static String substringFunctionOnlyBeginIndexExample(int beginIndex) {
		String substringString = "Sample String";
		return substringString.substring(beginIndex);
	}
	
	public static String substringFunctionBeginIndexAndEndIndexExample(int beginIndex, int endIndex) {
		String substringString = "Sample String";
		return substringString.substring(beginIndex, endIndex);
	}
	
	public static String subSequenceFunctionBeginIndexAndEndIndexExample(int beginIndex, int endIndex) {
		String subSequenceString = "Sample String";
		return subSequenceString.substring(beginIndex, endIndex);
	}
	
	public static String[] splitFunctionExample() {
		String stringToSplit = "Sample String";
		String[] stringArray = stringToSplit.split(" ");
		return stringArray;
	}
	
	public static String replaceFunctionExample(String oldString, String newString) {
		String replaceString = "Sample String";
		return replaceString.replace(oldString, newString);
	}
	
	public static boolean matchesFunctionExample(String regex) {
		String matchesString = "Sample String";
		return matchesString.matches(regex);
	}
	
	public static int indexOfFunctionExample(String searchString) {
		String matchesString = "Sample String";
		return matchesString.indexOf(searchString);
	}
	
	public static boolean equalsMethodExample() {
		String firstString = "Sample String";
		String secondString = new String("Sample String");
		return firstString.equals(secondString);
	}
	
	public static String concatFunctionExample() {
		String currentString = "Sample String";
		String concatString = " for this book.";
		return currentString.concat(concatString);
	}
	
	public static boolean startsWithFunctionExample() {
		String currentString = "Sample String";
		String startString = "Sample";
		return currentString.startsWith(startString);
	}
	
	public static boolean endsWithFunctionExample() {
		String currentString = "Sample String";
		String endString = "String";
		return currentString.endsWith(endString);
	}
	
	public static boolean containsFunctionExample() {
		String currentString = "Sample String";
		String containsString = "String";
		return currentString.contains(containsString);
	}
	
	public static int compareToFunctionExample() {
		String currentString = "Sample String";
		String compareToString = "Sample String";
		return currentString.compareTo(compareToString);
	}
	
	public static byte[] getBytesFunctionExample() {
		String currentString = "Sample String";
		return currentString.getBytes();
	}

}
