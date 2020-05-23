package com.nt.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		farmer f = new farmer();
		Address a = new Address();
		a.setHno("2/sannta");
		a.setLoc("up");
		f.setId(121);
		f.setName("nitesh");
		f.setAddres(a);

		ses.saveOrUpdate(f);
		tx.commit();
		ses.close();
		factory.close();
	}
}
