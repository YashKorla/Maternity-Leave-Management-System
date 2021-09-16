package com.maternity.leave.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
@Entity
@Table(name = "maternity_details")
public class MaternityDetails {
	@Id
	@Column(name = "employee_no")
	public String empno;
	
	@Column(name = "end_project", length = 100)
	public String endProj;
	
	@Column(name = "maternity_start_date", nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date startDate;
	
	@Column(name = "maternity_end_date", nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date endDate;
	
	@Column(name = "maternity_confirmed_end_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date confirmedDate;
	
	@Column(name = "ctc_rs", nullable = false)
	public double ctcRs;
	
	@Column(name = "ctc_d", nullable = false)
	public double ctcD;
	
	@Column(name = "remark")
	public String remark;
	
	@Column(name = "created_by", length = 100)
	public String createdBy;
	
	@Column(name = "created_at")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date createdAt;
	
	@Column(name = "updated_by", length = 100)
	public String updatedBy;
	
	@Column(name = "updated_at")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date updatedAt;
	
	@Column(name = "is_active", length = 5)
	public String isActive;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_number")
	private EmployeeDetails ed;

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEndProj() {
		return endProj;
	}

	public void setEndProj(String endProj) {
		this.endProj = endProj;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(Date confirmedDate) {
		this.confirmedDate = confirmedDate;
	}

	public double getCtcRs() {
		return ctcRs;
	}

	public void setCtcRs(double ctcRs) {
		this.ctcRs = ctcRs;
	}

	public double getCtcD() {
		return ctcD;
	}

	public void setCtcD(double ctcD) {
		this.ctcD = ctcD;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}
