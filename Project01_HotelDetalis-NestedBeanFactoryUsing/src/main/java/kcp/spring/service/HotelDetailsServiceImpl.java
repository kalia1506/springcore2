package kcp.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import kcp.spring.bo.HotelDetailsBO;
import kcp.spring.dao.HotelDetailsDAO;
import kcp.spring.dto.HotelDetailsDTO;

public class HotelDetailsServiceImpl implements HotelDetailsService {
		private HotelDetailsDAO dao;
		
	public HotelDetailsServiceImpl(HotelDetailsDAO dao) {
			this.dao = dao;
		}

	@Override
	public List<HotelDetailsDTO> srearchProcess(String c1, String c2) throws Exception {
		List<HotelDetailsBO> listBO = dao.searchHotel(c1, c2);
		List<HotelDetailsDTO> listDTO = new ArrayList<HotelDetailsDTO>();
		HotelDetailsDTO dto = null;
		for (HotelDetailsBO bo : listBO) {
		    dto = new HotelDetailsDTO();
		    BeanUtils.copyProperties(bo, dto);
		  // System.out.println(bo.getCity());
		    listDTO.add(dto);
		}
		return listDTO;
		
	}

}
