package com.firsttest.employee.controller;

import com.firsttest.employee.model.Employee;
import com.firsttest.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //define a method/api to handle the post request of the data is below
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) //this returns the model object Employee(thats why the return type is Employee here)
    {
        employeeService.createEmployee(employee);
        return employeeService.createEmployee(employee);


    }



}
