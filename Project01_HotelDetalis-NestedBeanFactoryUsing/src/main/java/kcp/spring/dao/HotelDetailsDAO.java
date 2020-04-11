package kcp.spring.dao;

import java.util.List;

import kcp.spring.bo.HotelDetailsBO;

public interface HotelDetailsDAO {
		public List<HotelDetailsBO> searchHotel(String c1,String c2)throws Exception;
}
