package com.gabriel.service;
import org.springframework.stereotype.Service;

import com.gabriel.exceptions.UnsupportedMathOperationException;
import com.gabriel.util.NumericValidation;

@Service
public class SumSevice {
	
	public Double sum(String numberOne, String numberTwo) {
		if (!NumericValidation.isNumeric(numberOne) || !NumericValidation.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return NumericValidation.convertToDouble(numberOne) + NumericValidation.convertToDouble(numberTwo);
		
	}
	
}
