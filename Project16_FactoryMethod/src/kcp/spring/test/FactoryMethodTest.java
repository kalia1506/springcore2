package kcp.spring.test;

import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class FactoryMethodTest {

	public static void main(String[] args) {
		/*
		 * DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("kcp/spring/configuration/applicationContext.xml")
		 * ;
		 */
		BeanFactory factory;
		factory = new XmlBeanFactory(new ClassPathResource("kcp/spring/configuration/applicationContext.xml"));
		Class c1 = null;
		c1 = factory.getBean("c1", Class.class);
		System.out.println(c1 + " " + c1.getClass());
		System.out.println();
		Properties c2 = factory.getBean("c2", Properties.class);
		System.out.println(c2 + " " + c2.getClass());
		System.out.println();
		String string=factory.getBean("i2",String.class);
		System.out.println(string);
		System.out.println();
		String subString_=factory.getBean("i3",String.class);
		System.out.println(subString_);

	}

}
