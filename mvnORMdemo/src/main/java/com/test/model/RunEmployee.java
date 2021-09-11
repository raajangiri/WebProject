package com.test.model;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// oneToOne();
		//oneToMany();
		//manyToMany();
		getData();
	}

	static void oneToOne() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//				SessionFactory sf=new Configuration().configure().
		Session sess = sf.openSession();
		sess.beginTransaction();

		Address adr = new Address();
		adr.setCity("nepal");
		adr.setCity("kathmandu");
		adr.setState("1123");
		adr.setZip("123");

		sess.save(adr);

		Employee emp = new Employee();
		emp.setId(20);
		emp.setAge("23");
		emp.setFname("hari");
		sess.save(emp);

		sess.getTransaction().commit();
		sess.close();
	}

	static void oneToMany() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//				SessionFactory sf=new Configuration().configure().
		Session sess = sf.openSession();
		sess.beginTransaction();

		Address adr = new Address();
		adr.setCity("nepal");
		adr.setCity("kathmandu");
		adr.setState("1123");
		adr.setZip("123");

		sess.save(adr);

		Employee emp = new Employee();
		 
		emp.setAge("23");
		emp.setFname("hari");

		Phone p1 = new Phone();
		p1.setNumber("95u984y594");
		p1.setType("ntc");
		p1.setEmployee(emp);
		sess.save(p1);

		Phone p2 = new Phone();
		p2.setNumber("95");
		p2.setType("ncell");
		p2.setEmployee(emp);
		sess.save(p2);

		Phone p3 = new Phone();
		p3.setNumber("92325");
		p3.setType("ncell");
		p3.setEmployee(emp);
		sess.save(p3);

		emp.setPhoneList(Arrays.asList(p1, p2, p3));

		sess.save(emp);

		sess.getTransaction().commit();
		sess.close();

	}
	
	static void manyToMany()
	{

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//				SessionFactory sf=new Configuration().configure().
		Session sess = sf.openSession();
		sess.beginTransaction();

		Address adr = new Address();
		adr.setCity("nepal");
		adr.setCity("kathmandu");
		adr.setState("1123");
		adr.setZip("123");

		sess.save(adr);

		Employee emp = new Employee();
		 
		emp.setAge("23");
		emp.setFname("hari");

		Phone p1 = new Phone();
		p1.setNumber("95u984y594");
		p1.setType("ntc");
		p1.setEmployee(emp);
		sess.save(p1);

		Phone p2 = new Phone();
		p2.setNumber("95");
		p2.setType("ncell");
		p2.setEmployee(emp);
		sess.save(p2);

		Phone p3 = new Phone();
		p3.setNumber("92325");
		p3.setType("ncell");
		p3.setEmployee(emp);
		sess.save(p3);
		
		
		Department d1=new Department();
		d1.setName("It");
		sess.save(d1);
		
		Department d2=new Department();
		d2.setName("Engineering");
		sess.save(d2);
		
		emp.setDeptList(Arrays.asList(d1,d2));
		

		emp.setPhoneList(Arrays.asList(p1, p2, p3));

		sess.save(emp);

		sess.getTransaction().commit();
		sess.close();
		
	}
	
	static void getData() {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		SessionFactory sf=new Configuration().configure().
Session sess = sf.openSession();
   Criteria crt=sess.createCriteria(Employee.class);
   List<Employee> elist=crt.list();
   
   for(Employee e:elist)
   {
	   
	   System.out.println(e.getFname());
	   System.out.println(e.getAddress().getCountry());
	   System.out.println(e.getDeptList().get(0).getName());
   }
		
		
	}

}
