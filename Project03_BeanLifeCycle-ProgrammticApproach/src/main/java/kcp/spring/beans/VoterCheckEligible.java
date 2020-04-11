package kcp.spring.beans;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class VoterCheckEligible implements InitializingBean,DisposableBean {
		String pName;
		String address;
		int age;
	
		
		//Custom life cycle Initi method
		public void Myinit() throws IllegalAccessException {
			System.out.println("VoterCheckEligible.init()");
			if(pName==null || age<=0) {
				throw new IllegalAccessException("name and age value must be set");
			}
		}
		//business logic method
		public String checkEligibility() {
			if (age>=18) {
				return pName+" you are eligible to give your vote";
			}else {
			return pName+" you are not eligible to give your vote";
			}		
		}
		//custom destroy method
		public void Mydestroy() {
			System.out.println("VoterCheckEligible.Mydestroy()");
			pName=null;
			age=0;
			address=null;
		}
		@Override
		public void destroy() throws Exception {
			System.out.println("VoterCheckEligible.destroy()");	
		}
		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("VoterCheckEligible.afterPropertiesSet()");			
		}
		
		
}
