package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.NotNull;

public class EmployeePayrollDTO {

    @NotNull(message = "Name cannot be null")
    public String name;

    @NotNull(message = "Salary cannot be null")
    public long salary;

    @Override
    public String toString() {
        return "EmployeePayrollDTO{name='" + name + "', salary=" + salary + "}";
    }
}