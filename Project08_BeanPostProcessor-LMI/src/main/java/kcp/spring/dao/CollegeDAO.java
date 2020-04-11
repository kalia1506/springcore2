package kcp.spring.dao;

import kcp.spring.bo.EmployeeBO;
import kcp.spring.bo.StudentBO;

public interface CollegeDAO {
	public int insertData(EmployeeBO bo) throws Exception;
	public int insertData(StudentBO bo) throws Exception;
}
