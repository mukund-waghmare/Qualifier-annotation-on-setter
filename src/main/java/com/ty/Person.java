package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	

	Mobile mobile;
	
	public Mobile getMobile() {
		return mobile;
	}

	@Autowired
	@Qualifier(value = "nokia")
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public void personMethod()
	{
		System.out.println("Method From Person");
		mobile.mobile();
	}
	
}
