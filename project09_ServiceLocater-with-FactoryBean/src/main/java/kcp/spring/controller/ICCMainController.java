package kcp.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.spring.service.CrickbuzzService;




@WebServlet("/controller")
public class ICCMainController extends HttpServlet {
	ApplicationContext content;
	private String path = "kcp/spring/cofiguration/applicationContext.xml";
	CrickbuzzService crickbuzzService;

	@Override
	public void init() throws ServletException {
		content = new ClassPathXmlApplicationContext(path);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String scoreBoard = null;
		RequestDispatcher rd = null;
		int matchID = Integer.parseInt(req.getParameter("id"));
		crickbuzzService = content.getBean("crickbuzz", CrickbuzzService.class);
		try {
			scoreBoard = crickbuzzService.getScroe(matchID);
			req.setAttribute("score", scoreBoard);
			rd = req.getRequestDispatcher("/scoreboard.jsp");
			rd.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		super.doPost(req, res);
	}

}
