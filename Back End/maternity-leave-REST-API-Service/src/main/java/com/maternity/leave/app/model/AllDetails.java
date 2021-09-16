package com.maternity.leave.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Immutable
@Table(name = "all_details")
@Subselect("select * from all_details")
public class AllDetails {
	
	@Id
	@Column(name = "employee_number")
	private String empno;
	
	@Column(name = "employee_name")
	private String empname;
	
	@Column(name = "date_of_joining")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date doj;
	
	@Column(name = "department")
	private String dep;	
	
	@Column(name = "skills")
	private String skills;	
	
	@Column(name = "experience")
	private int exp;	
	
	@Column(name = "location")
	private String loc;	
	
	@Column(name = "start_project")
	private String startProj;	
	
	@Column(name = "end_project")
	public String endProj;
	
	@Column(name = "maternity_start_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date startDate;
	
	@Column(name = "maternity_end_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date endDate;
	
	@Column(name = "maternity_confirmed_end_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date confirmedDate;
	
	@Column(name = "ctc_rs")
	public double ctcRs;
	
	@Column(name = "ctc_d")
	public double ctcD;
	
	@Column(name = "remark")
	public String remark;
	
	@Column(name = "is_active")
	public String isActive;
	
	
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
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}
