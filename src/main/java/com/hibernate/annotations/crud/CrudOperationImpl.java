package com.hibernate.annotations.crud;

import java.util.List;

import org.hibernate.Session;

import com.scp.utility.DBSessionFactory;

public class CrudOperationImpl implements CrudOperation{

	public void storeStudent(Student s) {
		// TODO Auto-generated method stub
		Session session=DBSessionFactory.sf.openSession();
		session.save(s);
		System.out.println("Student Added successfully....!!!!");
		session.beginTransaction().commit();
		session.close();
	}

	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		Session session=DBSessionFactory.sf.openSession();
		session.update(s);
		System.out.println("Student Updated successfully....!!!!");
		session.beginTransaction().commit();
		session.close();
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Session session=DBSessionFactory.sf.openSession();
		return (Student) session.get(Student.class,id);
	}

	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		Session session=DBSessionFactory.sf.openSession();
		return (List<Student>)session.createQuery("from Student").list();
	}
	

}
