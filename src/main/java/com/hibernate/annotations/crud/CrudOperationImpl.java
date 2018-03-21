package com.hibernate.annotations.crud;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.scp.utility.DBSessionFactory;

public class CrudOperationImpl implements CrudOperation {

	public void storeStudent(Student s) {
		// TODO Auto-generated method stub
		Session session = DBSessionFactory.sf.openSession();
		session.save(s);
		System.out.println("Student Added successfully....!!!!");
		session.beginTransaction().commit();
		session.close();
	}

	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		Session session = DBSessionFactory.sf.openSession();
		session.update(s);
		System.out.println("Student Updated successfully....!!!!");
		session.beginTransaction().commit();
		session.close();
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Session session = DBSessionFactory.sf.openSession();
		return (Student) session.get(Student.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		Session session = DBSessionFactory.sf.openSession();
		return (List<Student>) session.createQuery("from Student").list();
	}

	public void deleteStudent(int id) {
		Session session=DBSessionFactory.sf.openSession();
		SQLQuery query=session.createSQLQuery("delete from stud_practice_tbl where roll_num=?");
		query.setParameter(0,id);
		int status=query.executeUpdate();
		if(status>0)
			System.out.println("Deleted successful");
		else
			System.out.println("Not Deleted successful");
		}

}
