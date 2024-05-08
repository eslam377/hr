package com.egomaa.demo.entity;


import jakarta.persistence.*;
import lombok.*;


import java.math.BigDecimal;

@Table(name = "employees")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {


    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Data hireDate;

    @Column(name = "salary")
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job ;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
