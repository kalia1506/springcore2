package kcp.spring.bo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HotelDetailsBO {
		private String hname, roomType;
	    private String  city,state,area;
	    private double preNight, ratting;
}
