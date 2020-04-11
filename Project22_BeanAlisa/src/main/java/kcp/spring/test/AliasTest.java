package kcp.spring.test;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import kcp.spring.beans.WishMessageGenerator;

public class AliasTest {
	private static String path = "kcp/spring/configuration/applicationContext.xml";
	private static String path1 = "kcp/spring/configuration/applicationContext1.xml";

	public static void main(String[] args) {
		BeanDefinitionRegistry factory = null;
		XmlBeanDefinitionReader reader = null;
		WishMessageGenerator generator = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		//reader.loadBeanDefinitions(path);
		// reader.loadBeanDefinitions(new FileSystemResource(path));
		reader.loadBeanDefinitions(path,path1);
		// get Bean
		generator = ((DefaultListableBeanFactory) factory).getBean("msg1", WishMessageGenerator.class);
		System.out.println("Wish Message::" + generator.generateMessage("raja"));
	}

	public static void main1(String[] args) {
		ApplicationContext context;
		WishMessageGenerator meGenerator = null;
		context = new ClassPathXmlApplicationContext(path);
		// meGenerator=context.getBean("wmsg",WishMessageGenerator.class);
		// meGenerator=context.getBean("message",WishMessageGenerator.class);
		meGenerator = context.getBean("m1", WishMessageGenerator.class);
		System.out.println(meGenerator.generateMessage("kalu"));
	}
}
