package kcp.spring.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelDetailsDTO implements Serializable {
	private String hname, roomType;
    private String  city,state,area;
    private double preNight, ratting;
}
