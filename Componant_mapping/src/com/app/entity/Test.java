package com.app.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
	     Session  ses=factory.openSession();
			Transaction tx= ses.beginTransaction();
		Address add= new Address();
			add.setHno("1/023 east");
			add.setLocation("BHOPAL");
			Persion per=new Persion();
			per.setId(4674974);
			per.setName("uday");
			per.setSal("30K");
			per.setAddress(add);
			
			ses.saveOrUpdate(per);
			tx.commit();
			ses.close();
			factory.close();
		   
		
	}

}
