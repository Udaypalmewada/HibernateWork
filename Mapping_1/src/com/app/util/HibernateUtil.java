package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil implements AutoCloseable{
private static SessionFactory sf=null;
static {
	sf=new Configuration().configure().buildSessionFactory();
}
public static SessionFactory sf() {
	return sf;
	
}
@Override
public void close() throws Exception {
	
}
}
