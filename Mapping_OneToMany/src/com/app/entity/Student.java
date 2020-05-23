package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="record")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int rollnumber;
private String name;
private List<Marks>marks=new ArrayList<>();

public int getRollnumber() {
	return rollnumber;
}
public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
