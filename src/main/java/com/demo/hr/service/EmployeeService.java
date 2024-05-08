package com.egomaa.demo.service;

import com.egomaa.demo.dto.EmployeeDTO;
import com.egomaa.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> getAllEmployees();


}
