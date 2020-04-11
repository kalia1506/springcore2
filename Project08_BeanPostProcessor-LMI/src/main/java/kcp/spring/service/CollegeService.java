package kcp.spring.service;

import kcp.spring.dto.EmployeeDTO;
import kcp.spring.dto.StudentDTO;

public interface CollegeService {
	public String processStudent(StudentDTO sdto) throws Exception;
	public String processEmployee(EmployeeDTO edto) throws Exception;
}
