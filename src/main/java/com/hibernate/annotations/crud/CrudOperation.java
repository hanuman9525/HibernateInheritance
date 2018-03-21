package com.hibernate.annotations.crud;

import java.util.List;

public interface CrudOperation {
	
	public void storeStudent(Student s);

	public void updateStudent(Student s);

	public Student getStudent(int s);

	public List<Student> listStudent();
}
