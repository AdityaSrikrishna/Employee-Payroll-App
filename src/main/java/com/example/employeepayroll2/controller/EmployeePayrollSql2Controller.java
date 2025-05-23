package com.example.employeepayroll2.controller;

import com.example.employeepayroll2.dto.EmployeePayrollDTO;
import com.example.employeepayroll2.model.EmployeePayrollData;
import com.example.employeepayroll2.service.IEmployeePayrollService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollSql2Controller {

    @Autowired
    private IEmployeePayrollSql2Service service;

    @GetMapping("/")
    public List<EmployeePayrollSql2Data> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollSql2Data getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollSql2Data createEmployee(@Valid @RequestBody EmployeePayrollSql2DTO dto) {
        return service.createEmployee(dto);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollSql2Data updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeePayrollSql2DTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted employee with ID: " + id;
    }
}