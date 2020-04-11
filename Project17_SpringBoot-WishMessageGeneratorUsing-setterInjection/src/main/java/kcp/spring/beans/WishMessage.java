package kcp.spring.beans;

import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wish")
public class WishMessage {
	@Autowired
	private Calendar calendar;

	public String getMessage(String s) {
		int hr = 0;
		hr = calendar.get(Calendar.HOUR_OF_DAY);
		if (hr < 12) {
			return s + " Good Morning";
		} else if (hr < 16) {
			return s + " Good AfterNoon";
		} else if (hr < 20) {
			return s + " Good Evnging";
		} else {
			return s + " Good Night";
		}

	}

}
