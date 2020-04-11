package kcp.spring.dao;

import kcp.spring.bo.EmployeeBO;
import kcp.spring.bo.StudentBO;

public class CollegeDAOImpl implements CollegeDAO {
	public CollegeDAOImpl() {
		System.out.println("CollegeDAOImpl.CollegeDAOImpl()");
	}

	@Override
	public int insertData(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insertData()" + bo.toString());
		return 1;
	}

	@Override
	public int insertData(StudentBO bo) throws Exception {
		System.out.println("StudentDAOImpl.insertData()" + bo.toString());
		return 1;
	}

}
