package com.sourav.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{2+3}")
	public int sum;

	@Value("#{2-3}")
	public int sub;

	@Value("#{2*3}")
	public int mul;

	@Value("#{15/3}")
	public int div;

	@Value("#{1==1}")
	public boolean equalValid;

	@Value("#{1 lt 3}")
	public boolean equalValidLt;

	@Value("#{1==3 || 2==2}")
	public boolean checkStatus;

	@Value("#{2<3 ? 'Yes' : 'No'}")
	public String ternaeryCheck;

	@Value("#{T(java.lang.Math).PI}")
	public int num;

	public static String call() {
		return "Call method call";
	}

	@Value("#{T(com.sourav.spel.Student).call()}")
	public String callMethod;
	
	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equalValid=" + equalValid
				+ ", equalValidLt=" + equalValidLt + ", checkStatus=" + checkStatus + ", ternaeryCheck=" + ternaeryCheck
				+ ", num=" + num + "]";
	}

}
