package com.example.test3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test3.model.Employee;
import com.example.test3.service.EmployeeServiceImple;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImple empServiceImple;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empServiceImple.saveEmployee(emp);
	}
	
	 @DeleteMapping("/delete/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long empId) {
		empServiceImple.deleteDepartmentById(empId);
		return "Deleted Successfully";
	}

	 @GetMapping("/employeeDetails")
	 
	    public List<Employee> fetchEmployeeList()
	    {
	        return empServiceImple.fetchEmployeeList();
	    }

}
