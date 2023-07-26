package com.sta.spTest02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public  SpTest02Application {
	private static final Logger log = LoggerFactory.getLogger(SpTest02Application.class);
	public static void main(String[] args) {
        log.info("---------------------------------------------");
		log.info("log in the main class");
		log.info("---------------------------------------------");
		SpringApplication.run(SpTest02Application.class, args);
	}

}
