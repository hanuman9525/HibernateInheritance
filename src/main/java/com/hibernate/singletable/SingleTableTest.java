package com.hibernate.singletable;

import org.hibernate.Session;

import com.scp.utility.DBSessionFactory;

public class SingleTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=DBSessionFactory.sf.openSession();
		session.beginTransaction();
		Vehicle v=new Vehicle("Passion");
		
		TwoWheeler t=new TwoWheeler("Pulsar","Bajaj");
		
		FourWheeler f=new FourWheeler("Alto", "Alto steering wheel");
		
		session.save(v);
		session.save(t);
		session.save(f);
		session.getTransaction().commit();
	}

}
