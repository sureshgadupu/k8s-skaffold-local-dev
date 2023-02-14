package dev.fullstackcode.k8s.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		System.out.println("from employee *************");
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
