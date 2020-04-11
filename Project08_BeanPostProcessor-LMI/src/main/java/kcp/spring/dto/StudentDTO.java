package kcp.spring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO extends BaseDTO {
	private String courses;

	public StudentDTO() {
		System.out.println("StudentDTO.StudentDTO()");
	}

	@Override
	public String toString() {
		return "StudentDTO [courses=" + courses + ", toString()=" + super.toString() + "]";
	}
	

}
