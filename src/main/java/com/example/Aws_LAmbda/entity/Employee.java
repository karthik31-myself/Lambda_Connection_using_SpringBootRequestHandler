package com.example.Aws_LAmbda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer empId;
    private String empName;
    private String empGrade;
    private String empSalary;
    private String empLocation;



}
