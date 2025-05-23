package com.example.employeepayroll2.service;

import com.example.employeepayroll2.dto.EmployeePayrollDTO;
import com.example.employeepayroll2.model.EmployeePayrollSql2Model;

import java.util.List;

public interface IEmployeePayrollSql2Service {
    List<EmployeePayrollSql2Model> getAllEmployees();
    EmployeePayrollSql2Model getEmployeeById(int empId);
    EmployeePayrollSql2Model createEmployee(EmployeePayrollDTO dto);
    EmployeePayrollSql2Model updateEmployee(int empId, EmployeePayrollDTO dto);
    void deleteEmployee(int empId);
}