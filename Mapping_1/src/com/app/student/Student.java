package com.app.student;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "studentmarks")
public class Student {
	@Id
	@Column(name = "stdid")
	private int sid;

	@Column(name = "stdname")
	private String stdname;

	@Column(name = "branch")
	private String branch;

	@ElementCollection
	@CollectionTable(name="marks",joinColumns=@JoinColumn(name="stdid"))
	@OrderColumn(name="sub")
	@Column(name="marks")
	private List<String>marks;

	public Student() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<String> getMarks() {
		return marks;
	}

	public void setMarks(List<String> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", stdname=" + stdname + ", branch=" + branch + ", marks=" + marks + "]";
	}

	
}
