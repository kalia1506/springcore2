package kcp.spring.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeBO extends BaseBO {
	private String qulification;

	public EmployeeBO() {
		System.out.println("EmployeeBO.EmployeeBO()");
	}

	@Override
	public String toString() {
		return "EmployeeBO [qulification=" + qulification + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
	
}
