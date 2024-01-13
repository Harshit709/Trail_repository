package com.example.employess.employeemanagements.Service;

import com.example.employess.employeemanagements.Entity.employeeEntity;

import java.util.List;

public interface employeeService {
    public String createEmployee(employeeEntity employeeEntity);
    public  employeeEntity getDetail(Integer empId);
    public List<employeeEntity> getAllemployee();
    public String deleteemployee(Integer empId);
public String updateEmployee(employeeEntity employeeEntity);
}