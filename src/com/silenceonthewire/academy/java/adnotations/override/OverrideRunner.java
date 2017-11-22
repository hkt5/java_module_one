package com.silenceonthewire.academy.java.adnotations.override;

public class OverrideRunner {
	public static void main(String[] args) {
		printBaseClassName();
		printExtensionClassName();
		printAbstractExtensionClassName();
		printInterfaceExtensionClassName();
	}
	
	public static void printBaseClassName() {
		BaseClass baseClass = new BaseClass();
		baseClass.printName();
	}
	
	public static void printExtensionClassName() {
		ExtensionClass extensionClass = new ExtensionClass();
		extensionClass.printName();
	}
	
	public static void printAbstractExtensionClassName() {
		AbstractExtensionClass abstractExtensionClass = new AbstractExtensionClass();
		abstractExtensionClass.printCurrentName();
	}
	
	public static void printInterfaceExtensionClassName() {
		NameInterface extendsInterfaceClass = new ExtendsInterfaceClass();
		extendsInterfaceClass.name();
	}
}
