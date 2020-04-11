package kcp.spring.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import kcp.spring.IOCcontainer.IOC_Container;

@SuppressWarnings("deprecation")
public class Crickter {
	String beanid;

	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}

	public Crickter() {
		System.out.println("Crickter 0 param constructor");
	}

	public void bowling() {
		System.out.println("crickter bowling");
	}

	public void fielding() {
		System.out.println("crickter fielding");
	}

	public void batting(BeanFactory factory) {
		System.out.println("batting  method");
		Bat bat=null;
		int runs=0;
		System.out.println(beanid);
		//perform dependency lookup
		bat=factory.getBean(beanid,Bat.class);
		//invoke methods
		runs=bat.batting();
		
		System.out.println("Cricketer is batting with the score::"+runs);

	}

}
