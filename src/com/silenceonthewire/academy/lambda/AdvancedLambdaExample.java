package com.silenceonthewire.academy.lambda;

public class AdvancedLambdaExample {

	public static void main(String[] args) {
		
		notLambdaChecker();
		lambdaChecker();

	}
	
	public static void lambdaChecker() {
		IntegerChecker<Integer> checker = object -> object % 5 == 0;
		System.out.println("Użycie wyrażenia lambda.");
		System.out.println(checker.checkInteger(10));
			
	}
	
	public static void notLambdaChecker() {
		IntegerChecker<Integer> checker = new IntegerChecker<Integer>() {
			
			@Override
			public boolean checkInteger(Integer object) {
				return object % 5 == 0;
			}
			
		};
		
		System.out.println("Nie używamy wyrażeń lambda.");
		System.out.println(checker.checkInteger(10));
			
	}

}
