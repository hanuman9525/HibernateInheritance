package com.hibernate.tablepersubclass;

import org.hibernate.Session;



public class TablePerSubClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = com.scp.utility.DBSessionFactory.sf.openSession();
		session.beginTransaction();

		Person p = new Person("Hanuman", "Adale");
		Employee e = new Employee("Hanuman", "Adale", "12-10-1991", "IT");
		Owner o = new Owner("Hanuman", "Adale", 170, 15000);

		session.save(p);
		session.save(e);
		session.save(o);
		
		session.getTransaction().commit();
		session.close();

	}

}
