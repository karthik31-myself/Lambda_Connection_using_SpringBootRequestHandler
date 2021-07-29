package com.example.Aws_LAmbda;

import com.example.Aws_LAmbda.entity.Employee;
import com.example.Aws_LAmbda.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class AwsLAmbdaApplication {

	@Autowired
	private EmployeeDao employeeDao;

	@Bean
	public Supplier<List<Employee>> empList(){
		return ()-> employeeDao.buildEmployees().stream().collect(Collectors.toList());

	}
	@Bean
	public Function<Integer,List<Employee>> findEmployeeById(){
		return (input)->employeeDao.buildEmployees()
				.stream()
				.filter(employee -> employee.getEmpId().equals(input)).collect(Collectors.toList());

	}



	public static void main(String[] args) {
		SpringApplication.run(AwsLAmbdaApplication.class, args);
	}

}
