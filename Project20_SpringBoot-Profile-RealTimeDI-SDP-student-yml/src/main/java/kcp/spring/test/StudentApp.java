package kcp.spring.test;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kcp.spring.configuration.AppConfig;
import kcp.spring.controller.StudentControl;
import kcp.spring.vo.StudentVO;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication()
@Import(AppConfig.class)
public class StudentApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = null;
		StudentControl control = null;
		context = SpringApplication.run(StudentApp.class, args);
		control = context.getBean("StudentController", StudentControl.class);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name:: ");
		String sName = sc.nextLine();
		System.out.println("Enter Student rollno:: ");
		String sRollno = sc.nextLine();
		System.out.println("Enter Student Address:: ");
		String sAddress = sc.nextLine();
		System.out.println("Enter Student Mark1:: ");
		String mark1 = sc.nextLine();
		System.out.println("Enter Student Mark2:: ");
		String mark2 = sc.nextLine();
		System.out.println("Enter Student Mark3:: ");
		String mark3 = sc.nextLine();
		System.out.println("Enter Student Mark4:: ");
		String mark4 = sc.nextLine();
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
