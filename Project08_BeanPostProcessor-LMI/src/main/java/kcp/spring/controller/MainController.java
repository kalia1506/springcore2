package kcp.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.CertPathValidatorException.Reason;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.dao.CollegeDAO;
import kcp.spring.dto.EmployeeDTO;
import kcp.spring.dto.StudentDTO;
import kcp.spring.service.CollegeService;

@WebServlet(value = "/controller", loadOnStartup = 1)
public class MainController extends HttpServlet {
	ApplicationContext context;
	String path = "kcp/spring/configuration/applicationContext.xml";

	public MainController() {
		System.out.println("MainController.MainController()");
	}

	@Override
	public void init() throws ServletException {
		context = new ClassPathXmlApplicationContext(path);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String buttonValue = null;
		buttonValue = request.getParameter("s1");
		System.out.println(buttonValue);
		String resultMsg = null;
		RequestDispatcher rd = null;
		CollegeService service = context.getBean("collegeService", CollegeService.class);

		if (buttonValue.equalsIgnoreCase("Student Register")) {
			StudentDTO sdto = new StudentDTO();
			sdto.setID(Integer.parseInt(request.getParameter("rno")));
			sdto.setName(request.getParameter("sname"));
			sdto.setCourses(request.getParameter("course"));
			sdto.setAddress(request.getParameter("add"));
			try {
				resultMsg = service.processStudent(sdto);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			EmployeeDTO edto = new EmployeeDTO();
			edto.setID(Integer.parseInt(request.getParameter("eid")));
			edto.setAddress(request.getParameter("add"));
			edto.setName(request.getParameter("ename"));
			edto.setQulification(request.getParameter("quly"));
			try {
				resultMsg = service.processEmployee(edto);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		request.setAttribute("resultMsg", resultMsg);
		rd = request.getRequestDispatcher("/result.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
