package com.silenceonthewire.academy.lambda;

import java.util.Arrays;
import java.util.List;

public class SimpleLambdaExample {

	public static void main(String[] args) {
		
		List<String> ourDomainsList = Arrays.asList("silenceonthewire.com","silence.cloud");
		
		System.out.println("Normalna iteracja z wykorzystaniem funkcji forEach().");
		ourDomainsList.forEach(listElement -> System.out.println(listElement));
		System.out.println("Iteracja referencyjna z wykorzystaniem funkcji forEach().");
		ourDomainsList.forEach(System.out::println);

	}
	
}
