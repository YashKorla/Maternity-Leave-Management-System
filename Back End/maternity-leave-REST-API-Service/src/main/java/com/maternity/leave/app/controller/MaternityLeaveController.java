package com.maternity.leave.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.maternity.leave.app.model.AllDetails;
import com.maternity.leave.app.model.EmployeeDetails;
import com.maternity.leave.app.model.MaternityDetails;
import com.maternity.leave.app.service.impl.*;

@RestController
@CrossOrigin
@RequestMapping("/maternityleave")
public class MaternityLeaveController {
	
	private MaternityDetailsServiceImpl maternityDetails;
	private AllDetailsServiceImpl allDetails;
	private EmployeeDetailsServiceImpl employeeDetails;
	
	public MaternityLeaveController(MaternityDetailsServiceImpl maternityDetails, AllDetailsServiceImpl allDetails,
									EmployeeDetailsServiceImpl employeeDetails) {
		super();
		this.maternityDetails = maternityDetails;
		this.allDetails = allDetails;
		this.employeeDetails = employeeDetails;
	}

	@GetMapping
	public List<AllDetails> getAllEmployees() {
		List<AllDetails> ad =  allDetails.getAllEmployees();
		List<AllDetails> ad2 = new ArrayList<>();
		
		for(AllDetails ad1: ad) {
			if(ad1.getIsActive().equals("Yes")) {
				ad2.add(ad1);
			}
		}
	
		return ad2;
	}
	
	@GetMapping("{empno}")
	public ResponseEntity<AllDetails> getEmployeeByID(@PathVariable("empno") String empno) {
		return new ResponseEntity<AllDetails>(allDetails.getEmployeeByID(empno), HttpStatus.OK);
	}
	
	@GetMapping("/getEmployees")
	public List<EmployeeDetails> getEmployee() {
		return employeeDetails.getEmployee();
	}
	
	@GetMapping("/getEmployees/{empno}")
	public ResponseEntity<EmployeeDetails> getEmployeeDetailsByID(@PathVariable String empno) {
		return new ResponseEntity<EmployeeDetails>(employeeDetails.getEmployeeByID(empno), HttpStatus.OK);
	}
	
	@GetMapping("/includingDelete")
	public List<AllDetails> getEmployeesWithDelete() {
		return allDetails.getAllEmployees();
	}
	
	@DeleteMapping("{empno}")
	public ResponseEntity<String> deleteEmployee(@PathVariable String empno) {
		maternityDetails.deleteByID(empno);
		
		return new ResponseEntity<String>("Employee Deleted Successfully", HttpStatus.OK);
	}
	
	@PostMapping
	@JsonFormat(pattern = "yyyy-MM-dd")
	public ResponseEntity<MaternityDetails> saveEmployee(@RequestBody MaternityDetails obj) 
																	throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(sdf.format(obj.startDate)));
		c.add(Calendar.MONTH, 6);
		obj.endDate = c.getTime();
		
		obj.ctcD = Math.round(obj.ctcRs / 72);
		
		LocalDate ld = LocalDate.now();
		obj.createdAt = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		obj.updatedBy = obj.createdBy;
		obj.updatedAt = obj.updatedAt;
		
		return new ResponseEntity<MaternityDetails>(maternityDetails.saveEmployee(obj), HttpStatus.CREATED);
	}
	
	@PutMapping("{empno}")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public ResponseEntity<MaternityDetails> updateEmployee(@PathVariable String empno, 
										@RequestBody MaternityDetails obj) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(sdf.format(obj.startDate)));
		c.add(Calendar.MONTH, 6);
		obj.endDate = c.getTime();
		
		obj.ctcD = Math.round(obj.ctcRs / 72);
		
		LocalDate ld = LocalDate.now();
		obj.updatedAt = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		return new ResponseEntity<MaternityDetails>(maternityDetails.updateEmployee(obj, obj.empno), HttpStatus.OK);
	}
}
