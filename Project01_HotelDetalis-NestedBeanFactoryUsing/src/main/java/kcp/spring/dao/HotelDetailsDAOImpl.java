package kcp.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import kcp.spring.bo.HotelDetailsBO;

public class HotelDetailsDAOImpl implements HotelDetailsDAO {
	private DataSource source;
	private static final String sql = "select * from hotel_details where city in(?,?)";

	public HotelDetailsDAOImpl(DataSource source) {
		this.source = source;
	}

	@Override
	public List<HotelDetailsBO> searchHotel(String c1, String c2) throws Exception {
		Connection connection = source.getConnection();
		HotelDetailsBO bo = null;
		List<HotelDetailsBO> listBO = null;
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, c1);
			ps.setString(2, c2);
			ResultSet rs = ps.executeQuery();
			listBO = new ArrayList<HotelDetailsBO>();
			while (rs.next()) {
				bo=new HotelDetailsBO();
				bo.setHname(rs.getString(1));
				bo.setRoomType(rs.getString(2));
				bo.setCity(rs.getString(3));
				bo.setArea(rs.getString(4));
				bo.setPreNight(rs.getFloat(5));
				bo.setRatting(rs.getFloat(6));
				bo.setState(rs.getString(7));
				System.out.println(rs.getString(3));
				listBO.add(bo);
			}
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return listBO;
	}

}
