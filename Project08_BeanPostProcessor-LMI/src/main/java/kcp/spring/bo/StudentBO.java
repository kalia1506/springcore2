package kcp.spring.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentBO extends BaseBO {
	private String courses;

	public StudentBO() {
		System.out.println("StudentBO.StudentBO()");
	}

	@Override
	public String toString() {
		return "StudentBO [courses=" + courses + ", toString()=" + super.toString() + "]";
	}

	

	
	
}
