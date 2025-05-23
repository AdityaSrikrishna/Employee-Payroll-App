package com.example.employeepayroll2.service;

import com.example.employeepayroll2.dto.EmployeePayrollDTO;
import com.example.employeepayroll2.exception.EmployeeNotFoundException;
import com.example.employeepayroll2.model.EmployeePayrollSql2Model;
import com.example.employeepayroll2.repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayrollSql2Service implements IEmployeePayrollSql2Service {

    @Autowired
    private EmployeePayrollSql2Repository repository;

    @Override
    public List<EmployeePayrollSql2Model> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public EmployeePayrollSql2Model getEmployeeById(int empId) {
        return repository.findById(empId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found: " + empId));
    }

    @Override
    public EmployeePayrollSql2Model createEmployee(EmployeePayrollDTO dto) {
        EmployeePayrollSql2Model data = new EmployeePayrollSql2Model();
        return repository.save(data);
    }

    @Override
    public EmployeePayrollSql2Model updateEmployee(int empId, EmployeePayrollDTO dto) {
        EmployeePayrollSql2Model existing = this.getEmployeeById(empId);
        existing.setName(dto.name);
        existing.setSalary(dto.salary);
        return repository.save(existing);
    }

    @Override
    public void deleteEmployee(int empId) {
        EmployeePayrollSql2Model existing = this.getEmployeeById(empId);
        repository.delete(existing);
    }
}