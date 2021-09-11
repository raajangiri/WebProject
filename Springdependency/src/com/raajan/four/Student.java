package com.raajan.four;

public class Student {

	private int id;
	Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void cheating() {
		cheat.cheat();
		System.out.println("id is" + id);
	}
}
