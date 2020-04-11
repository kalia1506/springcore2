package kcp.spring.beans;

import java.util.Date;

public class ScheduleReminder {

	private Date date;
	String msg = null;

	public ScheduleReminder(Date date) {
		System.out.println("ScheduleReminder.ScheduleReminder( 0 param constructor)");
		this.date = date;
	}

	public String confrimAppoinment() {
		Date sysDate = new Date();
		System.out.println(date);
		System.out.println(sysDate);
		if (date.getYear() == sysDate.getYear() && date.getMonth() == sysDate.getMonth()
				&& date.getDay() == sysDate.getDay()) {
			return msg = "you appoinment is ready";
		} else {
			return msg = " appoinment is cancel";
		}

	}

}
