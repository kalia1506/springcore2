package kcp.spring.service;

import java.util.List;

import kcp.spring.dto.HotelDetailsDTO;

public interface HotelDetailsService {
		public List<HotelDetailsDTO> srearchProcess(String c1,String c2)throws Exception;
}
