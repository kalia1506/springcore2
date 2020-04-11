package kcp.spring.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

@SuppressWarnings("deprecation")
public class CalenderBeanFactory implements FactoryBean<Calendar> {

	private int year;
	private int month;
	private int date;

	public CalenderBeanFactory(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	System.out.println("CalenderBeanFactory.CalenderBeanFactory(3 param constructor)");	
	}

	
	@Override
	public Calendar getObject() throws Exception {
		System.out.println("CalenderBeanFactory.getObject()");
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);	
		month = calendar.get(Calendar.MONTH);
		date = calendar.get(Calendar.DATE);
		return calendar;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("CalenderBeanFactory.getObjectType()");
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("CalenderBeanFactory.isSingleton()");
		return true;
	}
}
