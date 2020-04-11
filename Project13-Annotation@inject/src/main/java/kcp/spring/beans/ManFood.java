package kcp.spring.beans;

import java.util.List;


public class ManFood {
	
	private List<String> food;
	public ManFood() {
		System.out.println("ManFood.ManFood(0 param constructor)");
	}

	
	public ManFood(List<String> food) {
		this.food = food;
	}

	public void setFood(List<String> food) {
		this.food = food;
	}


	@Override
	public String toString() {
		return "ManFood [food=" + food + "]";
	}

}
