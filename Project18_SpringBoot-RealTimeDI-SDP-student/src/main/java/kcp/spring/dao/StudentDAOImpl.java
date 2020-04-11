package kcp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kcp.spring.bo.StudentBO;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String sql = "insert into studenttable values(?,?,?,?,?,?)";
	@Autowired
	private DataSource dataSource;

	@Override
	public int insertData(StudentBO bo) throws Exception {
		Connection connection = dataSource.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, bo.getSName());
		ps.setInt(2, bo.getSRollno());
		ps.setString(3, bo.getSAddress());
		ps.setDouble(4, bo.getTotalMark());
		ps.setString(5, bo.getResult());
		ps.setDouble(6, bo.getAvgMark());
		int count = ps.executeUpdate();
		return count;
	}

}
