package com.maternity.leave.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maternity.leave.app.exception.ResourceNotFoundException;
import com.maternity.leave.app.model.AllDetails;
import com.maternity.leave.app.repository.AllDetailsRepository;
import com.maternity.leave.app.service.AllDetailsService;

@Service
public class AllDetailsServiceImpl implements AllDetailsService {

	private AllDetailsRepository alldetailsRepository;
	
	public AllDetailsServiceImpl(AllDetailsRepository alldetailsRepository) {
		super();
		this.alldetailsRepository = alldetailsRepository;
	}

	@Override
	public List<AllDetails> getAllEmployees() {
		return alldetailsRepository.findAll();
	}

	@Override
	public AllDetails getEmployeeByID(String empno) {
		return alldetailsRepository.findById(empno).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "Employee Number", empno)
				);
	}
}
