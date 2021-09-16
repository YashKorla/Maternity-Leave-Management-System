package com.maternity.leave.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maternity.leave.app.model.MaternityDetails;

public interface MaternityDetailsRepository extends JpaRepository<MaternityDetails, String> {

}
