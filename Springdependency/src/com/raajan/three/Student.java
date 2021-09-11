package com.raajan.three;

public class Student {

private int id;
 MathCheat mathCheat;
 
 
 
 public void setId(int id) {
	this.id = id;
}


public void setMathCheat(MathCheat mathCheat) {
	this.mathCheat = mathCheat;
}


public void cheating()
 {
	 mathCheat.mathCheat();
	 System.out.println("id is"+id);
 }
}
