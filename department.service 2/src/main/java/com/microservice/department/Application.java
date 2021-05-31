package com.microservice.department;

import com.microservice.department.repository.DepartmentRepositoryUsingMongoDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = DepartmentRepositoryUsingMongoDB.class)
@EnableJpaRepositories(excludeFilters =
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = DepartmentRepositoryUsingMongoDB.class))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
