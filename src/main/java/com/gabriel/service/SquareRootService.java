package com.gabriel.service;

import org.springframework.stereotype.Service;

import com.gabriel.exceptions.UnsupportedMathOperationException;
import com.gabriel.util.NumericValidation;

@Service
public class SquareRootService {
	public Double sqr(String numberOne) {
		if (!NumericValidation.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return Math.sqrt(NumericValidation.convertToDouble(numberOne));
	}
}
