package kcp.spring.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("wishMessage")
public class WishMessageGeneretor {
	@Resource
	private Calendar calendar;

	public WishMessageGeneretor() {
		System.out.println("WishMessageGeneretor.WishMessageGeneretor(0 param)");
	}

	public String getwishMessage(String s) {
		System.out.println("WishMessageGeneretor.getwishMessage()");
		int hr = calendar.get(Calendar.HOUR_OF_DAY);
		if (hr < 12)
			return s + " good morning";
		else if (hr <= 16)
			return s + " good afternoon";
		else if (hr <= 20)
			return s + " good evening";
		else
			return s + " good night";
	}
}
