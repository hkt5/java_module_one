package com.silenceonthewire.academy.conversions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class StringToNumber {
	
	public int stringToInt(String currentString) throws NumberFormatException {
		int currentInt = Integer.parseInt(currentString);
		return currentInt;
	}
	
	public float stringToFloat(String currentString) throws NumberFormatException {
		float currentFloat = Float.parseFloat(currentString);
		return currentFloat;
	}
	
	public double stringToDouble(String currentString) throws NumberFormatException {
		double currentDouble = Double.parseDouble(currentString);
		return currentDouble;
	}
	
	public Double convertEuropeanStringToDouble(String currentString) {
		Locale locale = new Locale("pl", "PL");
		Locale.setDefault(locale);
		NumberFormat numberFormat = NumberFormat.getInstance();
		Double result = 0.0;
		try {
			if (Class.forName("java.lang.Long").isInstance(numberFormat.parse(currentString))) {
				result = Double.parseDouble(String.valueOf(numberFormat.parse(currentString)));
			} else {
				result = (Double) numberFormat.parse(new String(currentString));
			}
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		} catch (ParseException parseException) {
			parseException.printStackTrace();
		}
		return result;
	}

}
