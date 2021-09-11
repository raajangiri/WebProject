package com.raajan.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private String nameOfAnimal;
	private int noOfheart;
	private Heart heart;

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public void setNoOfheart(int noOfheart) {
		this.noOfheart = noOfheart;
	}

	public Human() {

	}

	@Autowired
	public Human(Heart heart) {

		this.heart = heart;
		System.out.println("human constructor is calles which has heart as a constructor ");
	}

	public void startPumping() {

		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("you are dead");
		}

	}

}
