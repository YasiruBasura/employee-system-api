package com.firsttest.employee.service;

import com.firsttest.employee.entity.EmployeeEntity;
import com.firsttest.employee.model.Employee;
import com.firsttest.employee.repository.EmployeeRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepositary employeeRepositary; //object of the repositary

    public EmployeeServiceImpl(EmployeeRepositary employeeRepositary) {
        this.employeeRepositary = employeeRepositary;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepositary.save(employeeEntity);  //save method already available in the employee repositary
        return employee;
    }
}