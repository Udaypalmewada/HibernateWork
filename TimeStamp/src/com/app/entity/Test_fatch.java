package com.app.entity;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Test_fatch {

	public static void main(String[] args) {
		Employee emp1=new Employee();
/*		Employee emp2=new Employee();
		Employee emp3=new Employee();
	
		emp1.setEmpId(101);
		emp1.setEmpname("nitesh");
		emp1.setEmpsal(1000);
		emp1.setDate1(new Date());
		emp1.setDate2(new Date());
		emp1.setDate3(new Date());

		emp2.setEmpId(102);
		emp2.setEmpname("sunil");
		emp2.setEmpsal(2000);
		emp2.setDate1(new Date());
		emp2.setDate2(new Date());
		emp2.setDate3(new Date());

		emp3.setEmpId(103);
		emp3.setEmpname("uday");
		emp3.setEmpsal(3000);
		emp3.setDate1(new Date());
		emp3.setDate2(new Date());
		emp3.setDate3(new Date());
		
*/        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session  ses=factory.openSession();
        /*		Transaction tx=ses.beginTransaction();
		ses.save(emp1);
		ses.save(emp2);
		ses.save(emp3);
		tx.commit();
		
	*/	
      Employee emp=(Employee) ses.get(Employee.class, 101);
        System.out.println(emp);
        ses.close();
		factory.close();


	}

}
