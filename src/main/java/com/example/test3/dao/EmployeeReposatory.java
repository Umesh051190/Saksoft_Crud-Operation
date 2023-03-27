package com.example.test3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test3.model.Employee;
@Repository
public interface EmployeeReposatory extends JpaRepository<Employee, Long> {

}
