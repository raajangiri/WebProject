package com.raajan.college5;

public class College {

	private Principal principal;
	private Teacher teacher;
	
	


	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		teacher.teach();
		principal.pirncipalInfo();
		System.out.println("testing is dome");
	}

	

}
