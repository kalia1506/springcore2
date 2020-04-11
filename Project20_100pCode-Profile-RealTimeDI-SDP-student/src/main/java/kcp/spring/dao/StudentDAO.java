package kcp.spring.dao;

import kcp.spring.bo.StudentBO;

public interface StudentDAO {
    public int insertData(StudentBO bo) throws Exception;
}
