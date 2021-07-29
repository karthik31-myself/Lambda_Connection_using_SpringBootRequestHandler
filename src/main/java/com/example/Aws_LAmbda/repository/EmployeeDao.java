package com.example.Aws_LAmbda.repository;

import com.example.Aws_LAmbda.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class EmployeeDao {

    public List<Employee> buildEmployees(){
        return Stream.of(new Employee(1,"karthik","Y","24000","kvp"),
                new Employee(2,"Arjun","C","42500","cbe"),
                new Employee(3,"hari","Y","24000","chennai"),
                new Employee(4,"mady","c3","41000","chennai"),
                new Employee(5,"guru","Y","24000","ban")
        ).collect(Collectors.toList());



    }

}
