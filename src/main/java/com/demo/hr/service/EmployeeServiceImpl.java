package com.egomaa.demo.service;

import com.egomaa.demo.dto.EmployeeDTO;
import com.egomaa.demo.entity.Employee;
import com.egomaa.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository ;

    private final ModelMapper mapper ;

    @Override
    public List<EmployeeDTO> getAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();

        List<EmployeeDTO> employeeDTOS= employees.stream()
                .map(employee -> mapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());

        return employeeDTOS;
    }


}
