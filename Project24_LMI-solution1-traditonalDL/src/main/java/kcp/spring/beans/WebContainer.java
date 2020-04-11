package kcp.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer  {
	private String beanID;
	public WebContainer(String beanID) {
		System.out.println("WebContainer.WebContainer()");
		this.beanID = beanID;
	}

	@SuppressWarnings("resource")
	public void ProcessData(String data) {
		System.out.println("WebContainer.ProcessData()" + data);
		ApplicationContext context;
		RequestHandler handler;
		System.out.println(beanID);
		context=new ClassPathXmlApplicationContext("kcp/spring/configuration/applicationContext.xml");
		handler=context.getBean(beanID,RequestHandler.class);
		System.out.println(handler.handleRequest(data)); 
	}
}
