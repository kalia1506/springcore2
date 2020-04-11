package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import kcp.spring.IOCcontainer.IOC_Container;
import kcp.spring.beans.Crickter;

@SuppressWarnings("deprecation")
public class DepandencyLookuTest {

    public static void main(String[] args) {
	
	 BeanFactory bf;
	 Crickter ckter=null;
	 bf=IOC_Container.getContainer();
	 ckter=bf.getBean("ckt",Crickter.class);
	 //System.out.println(ckter);
	 ckter.batting();
	 ckter.bowling();
	 ckter.fielding();

    }

}
