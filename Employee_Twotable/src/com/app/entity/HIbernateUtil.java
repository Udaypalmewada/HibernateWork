package com.app.entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernateUtil {

	private static SessionFactory sf = null;

	static {
		sf = new Configuration().configure().buildSessionFactory();

	}

	public static SessionFactory getSf() {
		return sf;
	}
}
