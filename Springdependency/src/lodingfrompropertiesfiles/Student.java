package lodingfrompropertiesfiles;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	private String name;
	private String interestedCourse;
	private String hobby;
	
    
	public String getName() {
		return name;
	}
    @Value("${student.name}")
    @Required
	public void setName(String name) {
		this.name = name;
	}

	public String getInterestedCourse() {
		return interestedCourse;
	}
     @Value("${student.interedtedCourse}")
     
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public String getHobby() {
		return hobby;
	}
   @Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo() {
		System.out.println("student name" + name);
		System.out.println("student interest" + interestedCourse);
		System.out.println("hobbies" + hobby);

	}

}
