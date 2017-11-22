package com.silenceonthewire.academy.java.adnotations.depreacted;

public class DepdRunnerreacte {

	public static void main(String[] args) {
		printDeprectaedClassName();
		printDeprecatedMethodClassMethods();

	}
	
	public static void printDeprectaedClassName() {
		DeprecatedClass deprecatedClass = new DeprecatedClass();
		deprecatedClass.printName();
	}
	
	public static void printDeprecatedMethodClassMethods() {
		DeprecatedMethodClass deprecatedMethodClass = new DeprecatedMethodClass();
		deprecatedMethodClass.printDeprecatedMethodName();
		deprecatedMethodClass.printNormalMethodName();
	}

}
