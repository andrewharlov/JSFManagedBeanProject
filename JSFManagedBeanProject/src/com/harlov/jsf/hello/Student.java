package com.harlov.jsf.hello;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Student {
	private String firstName;
	private String lastName;
	
	//create constructor
	public Student() {}

	//define getter/setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String redirectRule() {
		if(this.firstName.toLowerCase().equals("andy")) {
			return "success";
		}else {
			return "fail";
		}
	}
		
}
