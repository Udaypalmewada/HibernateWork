package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="emptable")
public class Employee {
@Id
@Column(name="empid")
private int empId;
@Column(name="empname")
private String empname;
@Column(name="empsal")
private double empsal;
@Temporal(TemporalType.TIME)
private Date date1;
@Temporal(TemporalType.DATE)
private Date date2;
@Temporal(TemporalType.TIMESTAMP)
private Date date3;
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
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}
public Date getDate1() {
	return date1;
}
public void setDate1(Date date1) {
	this.date1 = date1;
}
public Date getDate2() {
	return date2;
}
public void setDate2(Date date2) {
	this.date2 = date2;
}
public Date getDate3() {
	return date3;
}
public void setDate3(Date date3) {
	this.date3 = date3;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empname=" + empname + ", empsal=" + empsal + ", date1=" + date1 + ", date2="
			+ date2 + ", date3=" + date3 + "]";
}


}
