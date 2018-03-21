package com.hibernate.tableperconcreteclass;

import org.hibernate.Session;

public class ConcreteClassTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = com.scp.utility.DBSessionFactory.sf.openSession();
		session.beginTransaction();

		//College c = new College("Modern Pune");
		Student s = new Student("ATSS", "Hanuman", "Pune");
		Proffessor p = new Proffessor("ATSS", "Vaibhav", "Permanant");
		//session.save(c);
		session.save(s);
		session.save(p);
		session.getTransaction().commit();
		session.close();

	}

}
