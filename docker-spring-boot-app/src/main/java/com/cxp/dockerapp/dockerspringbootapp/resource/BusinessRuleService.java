package com.cxp.dockerapp.dockerspringbootapp.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessRuleService {
 
	@CrossOrigin
	@RequestMapping(value = "/rest/rules/rule1/{age}/{salary}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String rule1(@PathVariable int age, @PathVariable int salary) {
		System.out.println("Rule 1 called...!!!");
		
		if(age < 30 && salary < 10000) {
			return "Not eligible. Age should be more than 30 & salary should be more than 10000";
		} else if (age < 30) {
			return "Not eligible. Age should be more than 30";
		}  else if (salary < 10000) {
			return "Not eligible. Salary should be more than 10000";
		} else {
			return "Congratulation, you are elibile.";
		}
	}
	
}
