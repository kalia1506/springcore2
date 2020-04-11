package kcp.spring.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("viechle")
public class Viechle {
	//@Inject
	//@Named("engine1")
	private Engine engine;

	//@Inject
	public Viechle(Engine engine) {
		System.out.println("Viechle.Viechle(1 param construster)");
		this.engine = engine;
	}
	@Inject
	@Named("engine3")
	public void setEngine(Engine engine) {
		System.out.println("Viechle.setEngine()");
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Viechle [engine=" + engine + "]";
	}

}
