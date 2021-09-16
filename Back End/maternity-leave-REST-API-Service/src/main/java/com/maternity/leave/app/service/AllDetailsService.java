package com.maternity.leave.app.service;

import java.util.List;

import com.maternity.leave.app.model.AllDetails;

public interface AllDetailsService {
	List<AllDetails> getAllEmployees();
	AllDetails getEmployeeByID(String empno);
}
