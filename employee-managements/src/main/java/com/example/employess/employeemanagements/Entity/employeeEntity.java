package com.example.employess.employeemanagements.Entity;

import jakarta.persistence.*;

@Entity

public class employeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column(name="emp_Nm")
    private  String empName;

    @Column(name="emp_address")
    private String empAddress;

    @Column(name="emp_phoneno")
    private Integer empPhoneNumber;

    @Column(name="emp_fathername")
    private String empFatherName;

    public employeeEntity(String empName, String empAddress, Integer empPhoneNumber, String empFatherName) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empPhoneNumber = empPhoneNumber;
        this.empFatherName = empFatherName;
    }

    public employeeEntity() {
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public Integer getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(Integer empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }

    public String getEmpFatherName() {
        return empFatherName;
    }

    public void setEmpFatherName(String empFatherName) {
        this.empFatherName = empFatherName;
    }
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }


}
