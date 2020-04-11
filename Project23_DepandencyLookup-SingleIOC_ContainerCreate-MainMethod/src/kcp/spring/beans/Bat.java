package kcp.spring.beans;

import java.util.Random;

public class Bat {
	public Bat() {
		System.out.println("Bat 0 param constructor");
	}

	public int batting() {
		return new Random().nextInt(500);
	}
}
