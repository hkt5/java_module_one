package com.silenceonthewire.academy.arrays;

public class ExampleArrays {
	
	public static void main(String[] args) {
		deprecatedFor();
		currentArray();
	}
	
	public static void currentArray() {
		for(int currentInt: createArray()) {
			System.out.println(currentInt);
		}
	}
	
	@Deprecated
	public static void deprecatedFor() {
		int[] currentArray = createArray();
		for(int i = 0; i < currentArray.length; i++) {
			System.out.println(currentArray[i]);
		}
	}
	
	public static int[] createArray() {
		int[] currentArray;
		currentArray = new int[10];
		currentArray[0] = 0;
		currentArray[1] = 1;
		return currentArray;
	}

}
