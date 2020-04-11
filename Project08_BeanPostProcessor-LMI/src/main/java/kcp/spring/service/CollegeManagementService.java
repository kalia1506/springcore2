package kcp.spring.service;

import org.springframework.beans.BeanUtils;

import kcp.spring.bo.EmployeeBO;
import kcp.spring.bo.StudentBO;
import kcp.spring.dao.CollegeDAO;
import kcp.spring.dto.EmployeeDTO;
import kcp.spring.dto.StudentDTO;

public abstract class CollegeManagementService implements CollegeService {
	 private CollegeDAO dao;

	public CollegeManagementService(CollegeDAO dao) {
		this.dao = dao;
	}

	public abstract StudentBO getStudentBO();

	public abstract EmployeeBO getEmployeeBO();

	@Override
	public String processEmployee(EmployeeDTO edto) throws Exception {
		System.out.println("CollegeManagementService.processEmployee(dto)");
		EmployeeBO ebo = getEmployeeBO();
		BeanUtils.copyProperties(edto, ebo);
		int result = dao.insertData(ebo);
		//System.out.println(edto.toString());
		if (result == 1)
			return " EmployeeDTO success";
		else
			return " EmployeeDTO fail";

	}

	@Override
	public String processStudent(StudentDTO sdto) throws Exception {
		System.out.println("CollegeManagementService.processStudent(dto)");
		StudentBO sbo = getStudentBO();
		BeanUtils.copyProperties(sdto, sbo);
		//System.out.println(sdto.toString());

		int result = dao.insertData(sbo);
		if (result == 1)
			return " StudentDTO success";
		else
			return " StudentDTO fail";
	}
}
