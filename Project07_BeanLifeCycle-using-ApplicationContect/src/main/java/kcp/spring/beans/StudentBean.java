package kcp.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.ResolvableType;

public class StudentBean
		implements ApplicationContextAware, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
	
	private String name;
	private int rno;
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", rno=" + rno + "]";
	}

	
	
	
	
	public StudentBean(String name) {
		System.out.println("StudentBean(0ne param Constructor)");
		this.name = name;
	}
	public void setRno(int rno) {
		System.out.println("StudentBean.setRno(setterMethod)");
		this.rno = rno;
	}
	public void Myinit() {
		System.out.println("StudentBean.Myinit()");
	}
	public void MyDestroy() {
		System.out.println("StudentBean.MyDestroy()");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("StudentBean.destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("StudentBean.afterPropertiesSet()");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("StudentBean.setBeanFactory()");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("StudentBean.setBeanName()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("StudentBean.setApplicationContext()");
	}

}
