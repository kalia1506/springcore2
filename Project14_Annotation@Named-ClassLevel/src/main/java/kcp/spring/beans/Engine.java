package kcp.spring.beans;


import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("engine1")
public class Engine {
	@Value("1")
	private int id;
	@Value("abc123")
	private String type;

	
	public void setId(int id) {
		System.out.println("Engine.setId()");
		this.id = id;
	}

	public void setType(String type) {
		System.out.println("Engine.setType()");
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
}
