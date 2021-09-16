package com.maternity.leave.app.service;

import java.util.List;

import com.maternity.leave.app.model.EmployeeDetails;

public interface EmployeeDetailsService {
	List<EmployeeDetails> getEmployee();
	EmployeeDetails getEmployeeByID(String empno);
}
