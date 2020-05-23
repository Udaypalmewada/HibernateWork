package com.st.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		StudentEntity std=new StudentEntity();
		StudentEntity std1=new StudentEntity();
		StudentEntity std2=new StudentEntity();
		
		std.setStudentid(122);
		std.setStdname("SHYAM");
		std.setCource("HTML");
		std1.setStudentid(123);
		std1.setStdname("GHANSHYAM");
		std1.setCource("CSS");
		std2.setStudentid(124);
		std2.setStdname("PAPU");
		std2.setCource("KALLO");
		
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session  ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(std);
		ses.save(std1);
		ses.save(std2);
		tx.commit();
		ses.close();
		factory.close();

	}

}
