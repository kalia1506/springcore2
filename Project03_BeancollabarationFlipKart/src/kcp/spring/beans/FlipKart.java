package kcp.spring.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("flipKart")
public class FlipKart {
	Courier courier;
	public FlipKart() {
		System.out.println("FlipKart.FlipKart( o param contructor)");
	}
	 
	@Autowired
	public FlipKart(Courier courier) {
		this.courier = courier;
		System.out.println("FlipKart 1 param constructor");
	}

	public String shopping(String[] items, double[] orderAmount) {
		int orderID = new Random().nextInt(2000000000);
		double price = 0.0;
		for (int i = 0; i < orderAmount.length; i++) {
			price = price + orderAmount[i];
		}
		System.out.println(orderID);
		String confrmMsg = courier.deliver(orderID);

		return confrmMsg + "\n and items are '" + Arrays.toString(items)
						+ "'\n Particular order price '"+ Arrays.toString(orderAmount)
						+ "'\n and total Amount is Rs. " + price;

	}

}
