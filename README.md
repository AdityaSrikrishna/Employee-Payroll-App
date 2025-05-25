# Spring Boot Employee Payroll System (In-Memory Version)

Welcome to the Employee Payroll System built with Spring Boot. This project demonstrates CRUD operations for managing employee payroll data using RESTful APIs and in-memory storage (H2 database).

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)

## Overview

This application provides a backend REST service for managing employee data such as name, salary, gender, and start date. It is ideal for demonstrating Spring Boot fundamentals like REST controllers, services, DTOs, and validation.

## Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Lombok
- H2 Database (In-Memory)
- Maven

## Features

- Create, Read, Update, Delete employee records
- Input validation using annotations
- In-memory H2 database for quick testing
- DTO-based architecture

## Project Structure

- `model` – Employee model class  
- `dto` – Data Transfer Objects for validation and input
- `controller` – REST endpoints
- `service` – Business logic layer
- `repository` – In-memory data layer

## API Endpoints

- `GET /employees` – List all employees  
- `GET /employees/{id}` – Get employee by ID  
- `POST /employees` – Add new employee  
- `PUT /employees/{id}` – Update employee  
- `DELETE /employees/{id}` – Delete employee  
