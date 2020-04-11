package kcp.spring.bo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseBO {
	private int ID;
	private	String Name;
	private String address;
	private Date doj;

}
