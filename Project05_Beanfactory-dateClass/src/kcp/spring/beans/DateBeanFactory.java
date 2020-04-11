package kcp.spring.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

@SuppressWarnings("deprecation")
public class DateBeanFactory implements FactoryBean<Date> {

	private int year;
	private int month;
	private int date;

	public DateBeanFactory(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		System.out.println("DateBeanFactory.DateBeanFactory( 3 param constructor)");
	}

	@Override
	public Date getObject() throws Exception {
		System.out.println("DateBeanFactory.getObject()");
		return new Date(year, month, date);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateBeanFactory.getObjectType()");
		return Date.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("DateBeanFactory.isSingleton()");
		return false;
	}
}
