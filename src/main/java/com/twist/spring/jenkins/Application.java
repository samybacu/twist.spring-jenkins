package com.twist.spring.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	
	public static Logger logger = LoggerFactory.getLogger(Application.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application  twist.spring.jenkins started");
		logger.info("Application  twist.spring.jenkins started : second change in bootApp");
	}

	public static void main(String[] args) {
		
		logger.info("Application  twist.spring.jenkins started");
		logger.info("Application  twist.spring.jenkins started : second change in bootApp");

		SpringApplication.run(Application.class, args);
	}

}
