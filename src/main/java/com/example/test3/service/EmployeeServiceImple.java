package com.example.test3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.test3.dao.EmployeeReposatory;
import com.example.test3.model.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {
	@Autowired
	EmployeeReposatory empRepo;

	public Employee saveEmployee(Employee emp) {

		return empRepo.save(emp);

	}

	@Override
	public void deleteDepartmentById(Long empId) {
		// TODO Auto-generated method stub

		empRepo.deleteById(empId);
		;
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		return (List<Employee>) empRepo.findAll();
	}

}
