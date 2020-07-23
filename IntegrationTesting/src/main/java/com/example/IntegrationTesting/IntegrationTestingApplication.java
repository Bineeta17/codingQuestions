package com.example.IntegrationTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.sun.xml.fastinfoset.sax.Properties;

@SpringBootApplication
@EnableCaching
public class IntegrationTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationTestingApplication.class, args);
		
		
	}

}
