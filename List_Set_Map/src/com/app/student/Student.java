package com.app.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
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

//************************************************************************************************

	@ElementCollection
	@CollectionTable(name="gred",joinColumns=@JoinColumn(name="stdid"))
	@Column(name="gred")
	private Set<String>gred=new HashSet<String>();
//*******************************************************************************	
	
	@ElementCollection
	@CollectionTable(name="result",joinColumns=@JoinColumn(name="stdid"))
	@MapKeyColumn(name="subject")
     @Column(name="gread")
	private Map<String, String>result=new HashMap<String,String>();

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

	public Set<String> getGred() {
		return gred;
	}

	public void setGred(Set<String> gred) {
		this.gred = gred;
	}

	public Map<String, String> getResult() {
		return result;
	}

	public void setResult(Map<String, String> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", stdname=" + stdname + ", branch=" + branch + ", gred=" + gred + ", result="
				+ result + "]";
	}
	
	
}
