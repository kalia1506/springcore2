package kcp.spring.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class AreaReplacer implements MethodReplacer {
	private double l;
	public void setL(double l) {
		this.l = l;
	}

	public AreaReplacer() {
		System.out.println("AreaReplacer.AreaReplacer()");
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("AreaReplacer.reimplement()");
		return l*l;
	}
}
