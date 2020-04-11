package kcp.spring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO extends BaseDTO {
	private String qulification;

	public EmployeeDTO() {
		System.out.println("EmployeeDTO.EmployeeDTO()");
	}

	@Override
	public String toString() {
		return "EmployeeDTO [qulification=" + qulification + ", toString()=" + super.toString() + "]";
	}
	
}
