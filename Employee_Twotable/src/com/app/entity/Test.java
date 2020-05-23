package com.app.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) throws SecurityException{
	
	 SessionFactory factory=new Configuration().configure().buildSessionFactory();
     Session  ses=factory.openSession();
		Transaction tx= ses.beginTransaction();
	

	

   Employee e=new Employee();
   
   e.setEmpId(121);
   e.setEmpname("uday");
   e.setEmpdept("javadev");
   e.setEmpsal("20k");
   e.setEmpproj("interprice");
   e.setEmpexp("4Y3M");
   
   ses.saveOrUpdate(e);
	tx.commit();
	ses.close();
	factory.close();
   
}
}
