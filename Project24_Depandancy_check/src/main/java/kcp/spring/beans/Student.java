package kcp.spring.beans;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	
	private String sName;
	private int rollNo;
	private String cName;
	private List<String> subjects;
	private Address address;
}
