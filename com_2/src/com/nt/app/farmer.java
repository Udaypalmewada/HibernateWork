package com.nt.app;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class farmer {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Embedded
	private Address addres;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "farmer [id=" + id + ", name=" + name + ", addres=" + addres + "]";
	}

}
