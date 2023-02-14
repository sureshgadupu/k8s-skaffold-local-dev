package dev.fullstackcode.k8s.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentApplication {

	public static void main(String[] args) {
		System.out.println("from department *************");
		SpringApplication.run(DepartmentApplication.class, args);
	}

}
