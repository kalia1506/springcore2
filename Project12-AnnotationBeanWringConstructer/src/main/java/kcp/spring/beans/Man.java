package kcp.spring.beans;

public class Man {
	private String name;
	private ManFood food;

	public Man() {
		System.out.println("Man.Man(0 param constructor)");
	}

	
	public Man(String name, ManFood food) {
		this.name = name;
		this.food = food;
		System.out.println("Man.Man(2 param constructor)");
	}

	


	@Override
	public String toString() {
		return "Man [name=" + name + ", food=" + food + "]";
	}


	
	

}
