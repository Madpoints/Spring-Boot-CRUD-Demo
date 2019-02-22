package com.madpoints.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.madpoints.springboot.cruddemo.DAO.EmployeeDAO;
import com.madpoints.springboot.cruddemo.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public List<Employee> findAll() {

		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int theId) {
		
		return employeeDAO.findById(theId);
	}

	@Override
	public void save(Employee theEmployee) {
		
		employeeDAO.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		
		employeeDAO.deleteById(theId);
	}

}
