package com.db.hack.SpringCloudVisionApiDemo;

import java.util.stream.Stream;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.db.hack.entity.Customer;
import com.db.hack.repository.CustomerRepository;

@SpringBootApplication
public class SpringCloudVisionApiDemoApplication {

	private static final Log LOGGER = LogFactory.getLog(SpringCloudVisionApiDemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVisionApiDemoApplication.class, args);
		
	}

	@Bean
	public CommandLineRunner houses(CustomerRepository custRepository) {
		return (args) -> {
			custRepository.deleteAll();

			Stream.of(new Customer("Test1","user"),
					new Customer("Test2","user"),
					new Customer("Test3","user"))
					.forEach(custRepository::save);

			LOGGER.info("Number of customer is " + custRepository.count());
			custRepository.findAll().forEach((cust) -> LOGGER.info(cust.getFirstName()));
		};
	}
}
