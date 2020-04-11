package kcp.spring.beans;

import java.util.Calendar;


public class ScheduleReminder {

	private Calendar date;
	String msg = null;

	public ScheduleReminder(Calendar date) {
		System.out.println("ScheduleReminder.ScheduleReminder( 0 param constructor)");
		this.date = date;
	}

	public String confrimAppoinment() {
		Calendar cal = Calendar.getInstance();
		System.out.println(date);
		System.out.println(cal);

		if (cal.get(Calendar.YEAR) == date.get(Calendar.YEAR) && 
			cal.get(Calendar.MONTH) == date.get(Calendar.MONTH) && 
			cal.get(Calendar.DATE) == date.get(Calendar.DATE)) {
			return msg = "you appoinment is ready";
		} else {
			return msg = " appoinment is cancel";
		}

	}

}
