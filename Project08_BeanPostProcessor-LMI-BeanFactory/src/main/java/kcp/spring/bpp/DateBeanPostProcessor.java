package kcp.spring.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import kcp.spring.bo.BaseBO;

public class DateBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
				System.out.println("DateBeanPostProcessor.postProcessAfterInitialization()");
		if (bean instanceof BaseBO) {
				((BaseBO) bean).setDoj(new Date());
				//System.out.println(bean);
				return bean;
				
		}
		//System.out.println(bean);
		return bean;
	}

}
