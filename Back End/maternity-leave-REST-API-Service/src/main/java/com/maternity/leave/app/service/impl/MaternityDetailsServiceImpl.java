package com.maternity.leave.app.service.impl;

import org.springframework.stereotype.Service;

import com.maternity.leave.app.exception.ResourceNotFoundException;
import com.maternity.leave.app.model.MaternityDetails;
import com.maternity.leave.app.repository.MaternityDetailsRepository;
import com.maternity.leave.app.service.MaternityDetailsService;

@Service
public class MaternityDetailsServiceImpl implements MaternityDetailsService {
	private MaternityDetailsRepository maternityRepository;
	
	public MaternityDetailsServiceImpl(MaternityDetailsRepository maternityRepository) {
		super();
		this.maternityRepository = maternityRepository;
	}

	@Override
	public MaternityDetails saveEmployee(MaternityDetails md) {
		md.isActive = "Yes";
		return maternityRepository.save(md);
	}

	@Override
	public void deleteByID(String empno) {
		MaternityDetails md = maternityRepository.findById(empno).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "Employee Number", empno)
				);
		
		md.setIsActive("No");
		
		maternityRepository.save(md);
	}

	@Override
	public MaternityDetails updateEmployee(MaternityDetails md, String empno) {
		MaternityDetails existingDetails = maternityRepository.findById(empno).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "Employee Number", empno)
				);
		
		existingDetails.setStartDate(md.startDate);
		existingDetails.setEndDate(md.endDate);
		existingDetails.setConfirmedDate(md.confirmedDate);
		existingDetails.setRemark(md.remark);
		existingDetails.setEndProj(md.endProj);
		existingDetails.setCtcRs(md.ctcRs);
		existingDetails.setCtcD(md.ctcD);
		existingDetails.setUpdatedBy(md.updatedBy);
		existingDetails.setUpdatedAt(md.updatedAt);
		
		maternityRepository.save(existingDetails);
		
		return existingDetails;
	}
}
