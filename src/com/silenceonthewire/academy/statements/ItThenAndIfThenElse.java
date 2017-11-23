package com.silenceonthewire.academy.statements;

public class ItThenAndIfThenElse {
	
	public boolean ifThen(boolean booleanVariable) {
		if(booleanVariable) {
			return true;
		}
		return false;
	}
	
	public boolean ifThenElse(boolean booleanVariable) {
		if(booleanVariable) {
			return true;
		}else if(!booleanVariable) {
			return false;
		}else {
			return booleanVariable;
		}
	}

}
