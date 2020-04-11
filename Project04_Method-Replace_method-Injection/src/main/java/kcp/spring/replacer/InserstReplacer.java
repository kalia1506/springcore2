package kcp.spring.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

import lombok.Setter;
@Setter
public class InserstReplacer implements MethodReplacer {
	double rate = 1;
	public InserstReplacer() {
		System.out.println("InserstReplacer.0 param contructor");
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("InserstReplacer.reimplement()");
			double amt = (double) args[0];
			int time = (int) args[1];
			double replaceAmount = (amt * rate * time) / 100;
			return replaceAmount;
	}

}
