package com.st.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_get {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session  ses=factory.openSession();
	System.out.println("1....");
        StudentEntity s= (StudentEntity) ses.get(StudentEntity.class, 122);
        System.out.println("2....");
        //System.out.println(s);
        System.out.println("3....");
		ses.close();
		factory.close();

	}

}
