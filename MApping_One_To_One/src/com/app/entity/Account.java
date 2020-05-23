package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int acno;
	private String accno_typ;
	@OneToOne
	Customer customer;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAccno_typ() {
		return accno_typ;
	}

	public void setAccno_typ(String accno_typ) {
		this.accno_typ = accno_typ;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", accno_typ=" + accno_typ + "]";
	}

}
