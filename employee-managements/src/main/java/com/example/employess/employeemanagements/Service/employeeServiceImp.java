package com.example.employess.employeemanagements.Service;

import com.example.employess.employeemanagements.Entity.employeeEntity;
import com.example.employess.employeemanagements.Repositoy.employeeReposioty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class employeeServiceImp implements  employeeService {


    employeeReposioty employeeReposioty;
    public employeeServiceImp(com.example.employess.employeemanagements.Repositoy.employeeReposioty employeeReposioty) {
        this.employeeReposioty = employeeReposioty;
    }

    @Override
    public String createEmployee(employeeEntity employeeEntity) {
        employeeReposioty.save(employeeEntity);
        return "profile created successfully";


    }

    @Override
    public employeeEntity getDetail(Integer empId) {
     return employeeReposioty.findById(empId).get()
             ;
    }

    @Override
    public List<employeeEntity> getAllemployee() {
        return employeeReposioty.findAll();
    }

    @Override
    public String deleteemployee(Integer empId) {
        employeeReposioty.deleteById(empId);
        return "this user deleted successfully";

    }

    @Override
    public String updateEmployee(employeeEntity employeeEntity) {
        employeeReposioty.save(employeeEntity);
        return "this user updated successfully";
    }
}
