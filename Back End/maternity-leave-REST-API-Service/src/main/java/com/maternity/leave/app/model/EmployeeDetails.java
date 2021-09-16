package com.maternity.leave.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
	
	@Id
	@Column(name = "employee_number", length = 100)
	public String empno;
	
	@Column(name = "employee_name", nullable = false, length = 100)
	public String empname;
	
	@Column(name = "date_of_joining", nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date doj;
	
	@Column(name = "department", nullable = false, length = 100)
	public String dep;
	
	@Column(name = "skills", nullable = false, length = 100)
	public String skills;
	
	@Column(name = "experience", nullable = false)
	public int exp;
	
	@Column(name = "location", nullable = false, length = 100)
	public String loc;
	
	@Column(name = "start_project", nullable = false, length = 100)
	public String startProj;
	
	@Column(name = "created_by", nullable = false, length = 100)
	public String createdBy;
	
	@Column(name = "created_at", nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date createdAt;
	
	@Column(name = "updated_by", length = 100)
	public String updatedBy;
	
	@Column(name = "updated_at")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date updatedAt;
	
	@OneToOne(mappedBy = "ed", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private MaternityDetails md;

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getStartProj() {
		return startProj;
	}

	public void setStartProj(String startProj) {
		this.startProj = startProj;
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
}
