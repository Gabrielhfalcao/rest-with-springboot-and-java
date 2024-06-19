package com.gabriel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gabriel.service.AverageService;
import com.gabriel.service.DivisionService;
import com.gabriel.service.SquareRootService;
import com.gabriel.service.SubtractionService;
import com.gabriel.service.SumSevice;

@RestController
@RequestMapping("/operations")
public class OperationsController {
	
	@Autowired
	private SumSevice sumSevice;
	
	@Autowired
	private SubtractionService subtractionService;
	
	@Autowired
	private DivisionService divisionService;
	
	@Autowired
	private AverageService averageService;
	
	@Autowired
	private SquareRootService squareRootService;

	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) {
		return sumSevice.sum(numberOne, numberTwo);
	}

	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable String numberOne, @PathVariable String numberTwo) {
		return subtractionService.sub(numberOne, numberTwo);
	}

	@GetMapping("/division/{numberOne}/{numberTwo}")
	public Double div(@PathVariable String numberOne, @PathVariable String numberTwo) {
		return divisionService.div(numberOne, numberTwo);
	}

	@GetMapping("/average/{numberOne}/{numberTwo}")
	public Double avg(@PathVariable String numberOne, @PathVariable String numberTwo) {
		return averageService.avg(numberOne, numberTwo);
	}

	@GetMapping("/squareRoot/{number}")
	public Double sqr(@PathVariable String number) {
		return squareRootService.sqr(number);
	}

}
