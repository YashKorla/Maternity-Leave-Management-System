package com.maternity.leave.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maternity.leave.app.exception.ResourceNotFoundException;
import com.maternity.leave.app.model.EmployeeDetails;
import com.maternity.leave.app.repository.EmployeeDetailsRepository;
import com.maternity.leave.app.service.EmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

	EmployeeDetailsRepository employeeRepository;
	
	public EmployeeDetailsServiceImpl(EmployeeDetailsRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<EmployeeDetails> getEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeDetails getEmployeeByID(String empno) {
		return employeeRepository.findById(empno).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "Employee Number", empno)
				);
	}

}
