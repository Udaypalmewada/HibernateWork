package com.app.test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.app.entity.Account;
import com.app.entity.Customer;

public class Test {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();

		Customer cutomer = new Customer();
		Account account = new Account();

		cutomer.setName("uday");
		cutomer.setLastname("mewada");

		account.setAccno_typ("savint");
		cutomer.setAccount(account);

		ses.save(cutomer);
		ses.save(account);

		tx.commit();
		ses.close();
		factory.close();
	}
}
