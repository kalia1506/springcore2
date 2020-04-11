package kcp.spring.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kcp.spring.bo.StudentBO;
import kcp.spring.dao.StudentDAO;
import kcp.spring.dto.StudentDTO;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;
	

	

	@Override
	public String studentRegister(StudentDTO dto) throws Exception {
		StudentBO bo;
		String result = null;
		double totalMark = dto.getMark1() + dto.getMark2() + dto.getMark3() + dto.getMark4();
		double avg = totalMark / 4;
		double percentage = totalMark / 400 * 100;
		if (avg < 33)
			result = "fail";
		else
			result = "pass";
		bo = new StudentBO();
		bo.setSName(dto.getSName());
		bo.setSRollno(dto.getSRollno());
		bo.setSAddress(dto.getSAddress());
		bo.setTotalMark(totalMark);
		bo.setAvgMark(avg);
		bo.setResult(result);
		int count = dao.insertData(bo);
		if (count == 0) {
			return " failed and total mark " + totalMark + " & percentage::" + percentage + " Final Result:: " + result;
		} else {
			return "success and totalMark is:: " + totalMark + " & percentage:: " + percentage + " Final Result:: "
					+ result;
		}

	}

}
