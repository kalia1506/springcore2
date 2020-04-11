package kcp.spring.beans;

public class Charger {
	private int charagerID;
	private String name;
	private String capacity;
	private String type;
	private String color;
	private  Charger() {
		System.out.println("Charger.systrace()");
	}
	public void setCharagerID(int charagerID) {
		this.charagerID = charagerID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Charger [charagerID=" + charagerID + ", name=" + name + ", capacity=" + capacity + ", type=" + type
				+ ", color=" + color + "]";
	}
	
}
