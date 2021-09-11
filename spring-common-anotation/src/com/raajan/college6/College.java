package com.raajan.college6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	private Principal principal;
	private Teacher teacher;
	@Value("${college.name}")
	private String collageName;
	
	


	@Autowired // if we write the autowired in deceleration in above we dont need this setter or constructor.
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		System.out.println("my college name is "+collageName);
		teacher.teach();
		principal.pirncipalInfo();
		System.out.println("testing is dome");
	}

	

}
