package com.example.employess.employeemanagements.Controoler;

import com.example.employess.employeemanagements.Entity.employeeEntity;
import com.example.employess.employeemanagements.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class employeeController {


    employeeService employeeService;

    public employeeController(com.example.employess.employeemanagements.Service.employeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public String createEmployee(@RequestBody employeeEntity employeeEntity)
    {
       return employeeService.createEmployee(employeeEntity);

    }


}
