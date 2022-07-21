package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {
	
	@Autowired
	Environment environment;
	
	//	to get defaultModel you need to have the method as this
	public String getDefaultModel() {
		return environment.getProperty("vehicle.default.model");
	}
	//to get minRentPeriod you need to have the method as this
	public String  getMinRentPeriod() {
		return environment.getProperty("member.rent.min");
	}

}
