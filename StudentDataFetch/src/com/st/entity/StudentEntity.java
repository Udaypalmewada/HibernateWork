package com.st.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int studentid;
	private String stdname;
	private String cource;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	@Override
	public String toString() {
		return "StrudentEntity [studentid=" + studentid + ", stdname=" + stdname + ", cource=" + cource + "]";
	}

}
