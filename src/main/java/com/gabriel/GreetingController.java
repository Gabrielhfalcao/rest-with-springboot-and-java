package com.gabriel;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template = "Hello, %s";
	private static final AtomicLong couter = new AtomicLong();
	
	@GetMapping
	public Greeting greenting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(couter.incrementAndGet(), String.format(template, name));
	}
}
