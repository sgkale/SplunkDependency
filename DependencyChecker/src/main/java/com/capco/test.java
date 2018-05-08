package com.capco;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class test {
	static final Logger logger= Logger.getLogger(test.class);
	
	@GetMapping
	@RequestMapping(value="/test")
	public String demo() {
		return "testesd";
	}
	
	@GetMapping
	@RequestMapping("/test2/{name}")
	public String test2(@PathVariable("name") String name) {
		logger.info("spring test: "+name);
		return "logged";
	}

}
