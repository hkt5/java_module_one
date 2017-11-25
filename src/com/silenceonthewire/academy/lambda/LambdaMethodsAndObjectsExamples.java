package com.silenceonthewire.academy.lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class LambdaMethodsAndObjectsExamples {
	
	public static void main(String[] args) {
			
		noLambdaObject();
		sampleLambdaInstance();
		sampleReferenceLambdaInstance();
		newLambdaObjectIntance();
	
	}
	
	public static void noLambdaObject() {
		Object objectInstance = new Object();
		System.out.println("Mój kod to " + objectInstance.hashCode());
	}
	
	public static void sampleLambdaInstance() {
		Object objectInstance = new Object();
		IntSupplier equalsMethodOnObject = objectInstance::hashCode;
		System.out.println("Mój kod to " + equalsMethodOnObject.getAsInt());
	}
	
	public static void sampleReferenceLambdaInstance() {
		ToIntFunction<Object> hashCodeMethodOnClass = Object::hashCode;
		Object objectInstance = new Object();
		System.out.println("Mój kod to " + hashCodeMethodOnClass.applyAsInt(objectInstance));
	}
	
	public static void newLambdaObjectIntance() {
		Supplier<Object> objectCreator = Object::new;
		System.out.println("Mój kod to " + objectCreator.get().hashCode());
	}

}
