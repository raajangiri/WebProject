package com.raajan.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		
		System.out.println(" Octa Core,4 gb ram, 12 mp camera");
	
	   cpu.process(); 
	}

}
