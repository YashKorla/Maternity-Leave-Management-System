package com.maternity.leave.app.service;

import com.maternity.leave.app.model.MaternityDetails;

public interface MaternityDetailsService {
	MaternityDetails saveEmployee(MaternityDetails md);
	void deleteByID(String empno);
	MaternityDetails updateEmployee(MaternityDetails md, String empno);
}
