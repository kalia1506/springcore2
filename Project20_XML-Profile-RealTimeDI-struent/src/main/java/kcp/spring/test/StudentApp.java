package kcp.spring.test;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import kcp.spring.controller.StudentControl;
import kcp.spring.vo.StudentVO;

public class StudentApp {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = null;
		StudentControl control = null;
		ConfigurableEnvironment cEvg;
		context = new ClassPathXmlApplicationContext();
		cEvg = context.getEnvironment();
		cEvg.setActiveProfiles("test");
		context.setConfigLocation("classpath:kcp/spring/configuration/applicationContext.xml");
		context.refresh();
		control = context.getBean("StudentController", StudentControl.class);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name:: ");
		String sName = sc.next();
		System.out.println("Enter Student rollno:: ");
		String sRollno = sc.next();
		System.out.println("Enter Student Address:: ");
		String sAddress = sc.next();
		System.out.println("Enter Student Mark1:: ");
		String mark1 = sc.next();
		System.out.println("Enter Student Mark2:: ");
		String mark2 = sc.next();
		System.out.println("Enter Student Mark3:: ");
		String mark3 = sc.next();
		System.out.println("Enter Student Mark4:: ");
		String mark4 = sc.next();
		StudentVO vo = new StudentVO();
		vo.setSName(sName);
		vo.setSRollno(sRollno);
		vo.setSAddress(sAddress);
		vo.setMark1(mark1);
		vo.setMark2(mark2);
		vo.setMark3(mark3);
		vo.setMark4(mark4);
		System.out.println(control.processData(vo));

	}

}
