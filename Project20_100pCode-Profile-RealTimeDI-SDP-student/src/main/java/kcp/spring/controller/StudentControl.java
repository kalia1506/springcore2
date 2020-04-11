package kcp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import kcp.spring.dto.StudentDTO;
import kcp.spring.sevice.StudentService;
import kcp.spring.vo.StudentVO;

@Controller("StudentController")
public class StudentControl {

	@Autowired
	private StudentService service;

	

	public String processData(StudentVO vo) throws Exception {
		StudentDTO dto = new StudentDTO();
		dto.setSName(vo.getSName());
		dto.setSRollno(Integer.parseInt(vo.getSRollno()));
		dto.setSAddress(vo.getSAddress());
		dto.setMark1(Integer.parseInt(vo.getMark1()));
		dto.setMark2(Integer.parseInt(vo.getMark2()));
		dto.setMark3(Integer.parseInt(vo.getMark3()));
		dto.setMark4(Integer.parseInt(vo.getMark4()));
		String result = service.studentRegister(dto);
		return result;

	}

}
