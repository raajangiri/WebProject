package com.test.model;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class RunStudent {

	public static void main(String[] args) {

//		 addStudent();
		getUpdateStudent();
		deleteStudent();
		getAllStudent();

		deleteStudent();
//		 getUpdateStudent();
	}

	static void addStudent() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		SessionFactory sf=new Configuration().configure().
		Session sess = sf.openSession();
		sess.beginTransaction();

		Student s = new Student();
		s.setName("raaj");
		s.setLname("giri");
		s.setAge("22");
		s.setCollege("nec");
		s.setPhone("098");

		sess.save(s);
		sess.getTransaction().commit();
		sess.close();

	}

	// select all student

	static void getAllStudent() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//			SessionFactory sf=new Configuration().configure().
		Session sess = sf.openSession();
		Criteria crt = sess.createCriteria(Student.class);

		crt.add(Restrictions.eq("college", "nec"));
//		    crt.add(Restrictions.gt("age","22"));

		List<Student> slist = crt.list();

		for (Student s : slist) {

			System.out.println("id=" + s.getId());
			System.out.println("Last name=" + s.getLname());
			System.out.println("Firstname=" + s.getName());
			System.out.println("phone=" + s.getPhone());
			System.out.println("age=" + s.getAge());
			System.out.println("college" + s.getCollege());
			System.out.println("---------------------");
		}

	}

	static void getUpdateStudent() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		Student s = (Student) sess.get(Student.class, 7);

		s.setCollege("kec");
		s.setPhone("123");

		sess.update(s);
		sess.getTransaction().commit();
		sess.close();

	}

	static void deleteStudent() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		Student s = (Student) sess.get(Student.class, 1);

		sess.delete(s);
		sess.getTransaction().commit();
		sess.close();
	}

}
