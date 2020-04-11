package kcp.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Component("check")
public class VoterCheckEligible {
	@Value("${name}")
	String pName;
	@Value("${address}")
	String address;
	@Value("${age}")
	int age;

	// Custom life cycle Initi method
	@PostConstruct
	public void Myinit() throws IllegalAccessException {
		System.out.println("VoterCheckEligible.init()");
		if (pName == null || age <= 0) {
			throw new IllegalAccessException("name and age value must be set");
		}
	}
	// business logic method

	public String checkEligibility() {
		if (age >= 18) {
			return pName + " you are eligible to give your vote";
		} else {
			return pName + " you are not eligible to give your vote";
		}
	}

	// custom destroy method
	@PreDestroy
	public void Mydestroy() {
		System.out.println("VoterCheckEligible.Mydestroy()");
		pName = null;
		age = 0;
		address = null;
	}

}
