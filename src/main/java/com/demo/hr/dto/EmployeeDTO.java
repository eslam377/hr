package com.egomaa.demo.dto;

import com.egomaa.demo.entity.Department;
import com.egomaa.demo.entity.Job;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@AllArgsConstructor
public class EmployeeDTO {

    private Integer employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Data hireDate;

    private BigDecimal salary;

    private Job job ;

    private Department department;

}
