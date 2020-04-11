package kcp.spring.beans;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;




public class Man {

	private String name;
	@Inject
	@Named("food4")
	private ManFood food;

	public Man() {
		System.out.println("Man.Man(0 param constructor)");
		
	}

	@Inject
	@Named("food2")
	public Man(String name, ManFood food) {
		System.out.println("Man.Man(2 param constructor)");
		this.name = name;
		this.food = food;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Inject
	@Named("food3")
	public void setFood( ManFood food) {
		System.out.println("Man.setFood()");
		this.food = food;
	}

	@Inject
	@Named("food1")
	public void assign(ManFood food) {
		System.out.println("Man.assign(oribitary)");
		this.food = food;
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", food=" + food + "]";
	}

}
