package kcp.spring.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseDTO implements Serializable {
	private int ID;
	private	String Name;
	private String address;
	private Date doj;
}
