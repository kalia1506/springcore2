package kcp.spring.beans;

import org.springframework.beans.factory.annotation.Required;

public class Mobile {
	private long IMEI;
	private String moblieName;
	private double price;
	private Charger charger;
	public Mobile() {
		System.out.println("Mobile.Mobile()");
	}

	public void setIMEI(long iMEI) {
		IMEI = iMEI;
	}

	public void setMoblieName(String moblieName) {
		this.moblieName = moblieName;
	}
	@Required
	public void setPrice(double price) {
		this.price = price;
	}
	@Required
	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Mobile [IMEI=" + IMEI + ", moblieName=" + moblieName + ", price=" + price + ", charger=" + charger
				+ ", toString()=" + super.toString() + "]";
	}
	

}
