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
		std.setSid(111020);
		std.setStdname("nitesh");
		std.setBranch("cse");
		List <String>list=new ArrayList<String>();
		list.add("7");
		list.add("7");
		list.add("70");
		std.setMarks(list);
		//ses.save(std);
		ses.saveOrUpdate(std);
		tx.commit();
		ses.close();
		factory.close();
	}

}
