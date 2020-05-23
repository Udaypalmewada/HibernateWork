package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity

@SecondaryTables({ @SecondaryTable(name = "detail"), @SecondaryTable(name = "exp") })
@Table
public class Employee {
	@Id
	@Column(name = "empid")
	private int empId;

	@Column(name = "name")
	private String empname;

	@Column(name = "dept", table = "detail")
	private String empdept;

	@Column(name = "sal", table = "detail")
	private String empsal;

	@Column(name = "project", table = "exp")
	private String empproj;

	@Column(name = "exp", table = "exp")
	private String empexp;
	

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	public String getEmpsal() {
		return empsal;
	}

	public void setEmpsal(String empsal) {
		this.empsal = empsal;
	}

	public String getEmpproj() {
		return empproj;
	}

	public void setEmpproj(String empproj) {
		this.empproj = empproj;
	}

	public String getEmpexp() {
		return empexp;
	}

	public void setEmpexp(String empexp) {
		this.empexp = empexp;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empdept=" + empdept + ", empsal=" + empsal
				+ ", empproj=" + empproj + ", empexp=" + empexp + "]";
	}

}
