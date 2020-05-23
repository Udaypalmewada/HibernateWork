package com.app.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
	        Session  ses=factory.openSession();
			Transaction tx=ses.beginTransaction();
			Registration rg=new Registration();
			
			rg.setId(121);
			rg.setName("UDAY");
			rg.setEmail("UDaymewada@gmail.com");
			rg.setNumber(989321234);
			ses.save(rg);
			tx.commit();
			ses.close();
			factory.close();


	}

}
