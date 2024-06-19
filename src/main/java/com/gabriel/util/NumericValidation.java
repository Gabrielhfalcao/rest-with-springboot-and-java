package com.gabriel.util;

public class NumericValidation {
	
	private NumericValidation numericValidation;

	public static Double convertToDouble(String numberString) {
		if (numberString == null) {
			return 0D;
		} else {
			String number = numberString.replaceAll(",", ".");
			if (isNumeric(numberString)) {
				return Double.parseDouble(number);
			}
		}
		return 0D;
	}

	public static boolean isNumeric(String numberString) {
		if (numberString == null) {
			return false;
		} else {
			String number = numberString.replaceAll(",", ".");
			return number.matches("[+-]?[0-9]*\\.?[0-9]+");
		}
	}
	
}
