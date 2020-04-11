package kcp.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

public class Man {

	private String name;
	@Autowired
	private ManFood food;

	public Man() {
		System.out.println("Man.Man(0 param constructor)");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	// @Qualifier("f")
	public void setFood(ManFood food) {
		System.out.println("Man.setFood()");
		this.food = food;
	}

	@Autowired
	// @Qualifier("f")
	public void assign(ManFood food) {
		System.out.println("Man.assign(oribitary)");
		this.food = food;
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", food=" + food + "]";
	}

}
