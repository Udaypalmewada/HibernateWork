package com.app.student;

import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Test {

	public static void main(String[] args) {
		
		
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
	        Session  ses=factory.openSession();
			Transaction tx=ses.beginTransaction();
		Student std=new Student();
		std.setSid(111045);
		std.setStdname("uday");
		std.setBranch("cse");
		std.getGred().add("a+");
		std.getGred().add("a++");
		std.getGred().add("b+");
		std.getResult().put("m1", "a");
		std.getResult().put("m2", "a+");
		std.getResult().put("mm3", "c");
		//ses.save(std);
		ses.saveOrUpdate(std);
		tx.commit();
		ses.close();
		factory.close();
	}

}
