package com.akashit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	private Logger logger = LoggerFactory.getLogger(MsgController.class);
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		logger.debug("getGreetMsg()debug executed");
		logger.info("getWelcomeMsg() Welcome msg executed");
		String msg =  "Welcome to Akash IT";
		int i = 10/0;
		logger.info("getGreetMsg()execution ended");
		logger.debug("getGreetMsg()debug ended");
		return msg;
		
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		
		logger.info("getWelcomeMsg() Welcome msg executed");
		String msg =  "Good Morning";
		logger.info("getGreetMsg()execution ended");
		return msg;
		
		
	}

}
