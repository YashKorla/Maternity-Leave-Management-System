package com.maternity.leave.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maternity.leave.app.model.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, String> {

}
