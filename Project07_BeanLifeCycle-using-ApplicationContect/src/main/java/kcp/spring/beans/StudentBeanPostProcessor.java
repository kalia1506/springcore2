package kcp.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("StudentBeanPostProcessor.postProcessAfterInitialization()");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("StudentBeanPostProcessor.postProcessBeforeInitialization()");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
