package com.hibernate.annotations.crud;

import java.util.Iterator;
import java.util.List;

public class CrudOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrudOperation operation = new CrudOperationImpl();
		operation.deleteStudent(2);
		/*Student s = new Student("Dhanu", 85);
		operation.storeStudent(s);
		s.setRollNumber(4);
		s.setName("Dhanu");
		s.setMarks(75);
		operation.updateStudent(s);

		System.out.println("Student Details:" + operation.getStudent(2).toString());
		System.out.println("List of student:\n");
		List<Student> list = operation.listStudent();
		//System.out.println(list.toString());
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
			System.out.println(((Student)it.next()).toString());
*/	}

}
