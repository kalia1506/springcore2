package kcp.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import kcp.spring.dto.HotelDetailsDTO;
import kcp.spring.service.HotelDetailsService;
import kcp.spring.service.HotelDetailsServiceImpl;
import kcp.spring.vo.HotelDetailsVO;

public class MainController {
	private HotelDetailsService service;

	public MainController(HotelDetailsServiceImpl service) {
		this.service = service;
	}

	public List<HotelDetailsVO> displayHotelDetalis(String c1, String c2) throws Exception {
		List<HotelDetailsDTO> listDTO = service.srearchProcess(c1, c2);
		List<HotelDetailsVO> listVO = null;
		HotelDetailsVO vo = null;
		listVO= new ArrayList<HotelDetailsVO>();
		for (HotelDetailsDTO dto : listDTO) {
			vo = new HotelDetailsVO();
			vo.setHname(dto.getHname());
			vo.setRoomType(dto.getRoomType());
			vo.setCity(dto.getCity());
			vo.setArea(dto.getArea());
			vo.setPreNight(String.valueOf(dto.getPreNight()));
			vo.setRatting(String.valueOf(dto.getRatting()));
			vo.setState(dto.getState());
			//System.out.println(vo.getCity());
			listVO.add(vo);
		}
		return listVO;

	}
}
