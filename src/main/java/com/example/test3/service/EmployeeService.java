package com.example.test3.service;

import java.util.List;

import com.example.test3.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);

	public void deleteDepartmentById(Long empId);

	List<Employee> fetchEmployeeList();
}
