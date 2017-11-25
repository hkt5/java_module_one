package com.silenceonthewire.academy.lambda;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExample {

	public static void main(String[] args) {
		
		supplierExample();
		unaryOperatorExample();
		bigConsumerExample();
		functionExample();

	}
	
	public static void supplierExample() {
		
		Supplier<String> currentString = () -> "Przykład użycia interfejsu Supplier";
		System.out.println(currentString.get());
		
	}
	
	public static void unaryOperatorExample() {
		
		int integerValue = 2;
		Supplier<String> currentString = () -> "Mnożenie za pomocą interfejsu UnaryOperator:";
		UnaryOperator<Integer> currentSquare = currentValue -> currentValue * currentValue;
		System.out.println(currentString.get());
		System.out.println(currentSquare.apply(integerValue));
		
	}
	
	public static void bigConsumerExample() {
		
		int firstNumber = 2;
		long secondNumber = 3;
		Supplier<String> currentString = () -> "Mnożenie za pomocą interfejsu BigConsumer:";
		BiConsumer<Integer, Long> multiplier = (Integer integerValue, Long longValue) -> 
			System.out.println(integerValue * longValue);
		System.out.println(currentString.get());
		multiplier.accept(firstNumber, secondNumber);
		
	}
	
	public static void functionExample() {
		int firstNumber = 2;
		int secondNumber = 0;
		int thirdNumber = 5;
		
		Supplier<String> currentString = () -> "Mnożenie za pomocą interfejsu Function:";
		Function<Integer, Long> multiline = integerNumber -> {
			if(integerNumber != null && integerNumber % 2 == 0) {
				return (long) integerNumber * integerNumber;
			} else if (integerNumber != null && integerNumber == 0){
				return 0L;
			} else {
				return 1L;
			}
		};
		
		System.out.println(currentString.get());
		System.out.println(multiline.apply(firstNumber));
		System.out.println(multiline.apply(secondNumber));
		System.out.println(multiline.apply(thirdNumber));
		
	}


}
