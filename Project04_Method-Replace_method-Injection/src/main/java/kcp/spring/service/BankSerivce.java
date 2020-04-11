package kcp.spring.service;

public class BankSerivce {
	public BankSerivce() {
		System.out.println("BankSerivce.0 param constructor");
	}

	public double simpleAmountInterest(double amt, int year) {
		System.out.println("BankSerivce.simpleAmountInterest()");
		double payAmount = (amt * 1 * year) / 100;
		return payAmount;

	}
	public double CalcSqureArea(double l) {
		return l*l;
		
	}
//	public final double simpleAmountInterest(double amt, int year) {
//		System.out.println("BankSerivce.simpleAmountInterest()");
//		double payAmount = (amt *1 * year) / 100;
//		return payAmount;
//	}
//	public static double simpleAmountInterest(double amt, int year) {
//		System.out.println("BankSerivce.simpleAmountInterest()");
//		double payAmount = (amt *1 * year) / 100;
//		return payAmount;
//
//	}
}
