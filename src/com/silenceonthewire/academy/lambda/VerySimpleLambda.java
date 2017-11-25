package com.silenceonthewire.academy.lambda;

public class VerySimpleLambda {

	public static void main(String[] args) {
		
		StringAdderInterface msg = () -> {
    		return "Pozwól, że się przedstawię. Jestem wyrażeniem lambda.";
    	};
    	
        System.out.println(msg.getCurrentMessage());

	}
}
