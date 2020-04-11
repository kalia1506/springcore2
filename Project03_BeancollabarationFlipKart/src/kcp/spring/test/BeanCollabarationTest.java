package kcp.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kcp.spring.beans.FlipKart;

@SuppressWarnings("deprecation")
public class BeanCollabarationTest {

    public static void main(String[] args) {
	String path="kcp/spring/configuration/applicationContext.xml";
	BeanFactory beanFactory=null;
	Resource resource=null;
	FlipKart flipKart=null;
	String[] items=new String[]{"pant","shirt","baana"};
	double[] orderAmount= new double[] {1200,899,2000};
	resource=new ClassPathResource(path);
	beanFactory=new XmlBeanFactory(resource);
	flipKart=beanFactory.getBean("flipKart",FlipKart.class);
	System.out.println(flipKart.shopping(items, orderAmount));
	

    }

}
