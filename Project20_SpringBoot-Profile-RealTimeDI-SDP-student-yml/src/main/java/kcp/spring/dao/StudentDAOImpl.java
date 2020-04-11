package kcp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kcp.spring.bo.StudentBO;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String sql = "insert into studenttable values(?,?,?,?,?,?)";
	@Autowired
	private DataSource dataSource;

	@Autowired
	private Environment env;

	@Override
	public int insertData(StudentBO bo) throws Exception {
		System.out.println(dataSource.getClass() + " driver is  connected ");
		System.out.println(Arrays.toString(env.getActiveProfiles()) + "  profile Is Active");
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
