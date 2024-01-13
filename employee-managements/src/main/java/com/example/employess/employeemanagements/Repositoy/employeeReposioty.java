package com.example.employess.employeemanagements.Repositoy;


import com.example.employess.employeemanagements.Entity.employeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeReposioty extends JpaRepository<employeeEntity, Integer> {


}
