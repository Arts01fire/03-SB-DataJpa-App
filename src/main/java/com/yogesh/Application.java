package com.yogesh;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yogesh.entity.Customer;
import com.yogesh.repo.CustomerRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		
		CustomerRepo repo=context.getBean(CustomerRepo.class);
		
		
		
		/*
		 * Customer c=new Customer(302,"Raja","Hyd",2650); repo.save(c);
		 */
		
		
		Iterable<Customer> entities = repo.findAllById(Arrays.asList(301,302));
		
		 entities.forEach(entity ->{ System.out.println(entity); });
		
	
	context.close();
	}

}
